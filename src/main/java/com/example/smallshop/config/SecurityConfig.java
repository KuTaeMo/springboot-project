package com.example.smallshop.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public BCryptPasswordEncoder encode(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/", "/user/**", "/image/**", "/follow/**","/comment/**").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/seller/**").access("hasRole('ROLE_SELLER')")
                .antMatchers("/").access("hasRole('ROLE_ANONYMOUS')")
                .anyRequest()
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/auth/loginForm")
                .loginProcessingUrl("/login") // post/login 주소를 디스패처 확인하면 필터가 낚아챔
                .defaultSuccessUrl("/");
                /*.and()
                .oauth2Login()
                .userInfoEndpoint();
                .userService(oAuth2DetailsService);*/
        // OAuth2.0과 CORS는 나중에!
    }
}
