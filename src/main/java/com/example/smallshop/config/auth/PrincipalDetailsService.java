package com.example.smallshop.config.auth;

import com.example.smallshop.domain.memberD.MemberDRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {

    private final MemberDRepository memberDRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("로그인 진행 중....");
        //User principal=userRepository.findByUsername(username);

        /*if(principal==null) {
            System.out.println("없음");
            return null;
        }else {
            System.out.println("있음");
            return new PrincipalDetails(principal);
        }*/
        return null;
    }
}
