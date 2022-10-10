package com.example.smallshop.config.auth;

import com.example.smallshop.domain.memberD.MemberDEntity;
import com.example.smallshop.domain.memberM.MemberMEntity;
import com.example.smallshop.domain.memberM.RoleType;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

@Data
public class PrincipalDetails implements UserDetails, OAuth2User {
    private MemberMEntity mbrM;
    private MemberDEntity mbrD;
    private Map<String, Object> attributes;
    private boolean oauth;

    public PrincipalDetails(MemberMEntity mbrM, MemberDEntity mbrD) {
        this.mbrM = mbrM;
        this.mbrD = mbrD;
    }

    public PrincipalDetails(MemberMEntity mbrM, MemberDEntity mbrD,Map<String, Object> attributes) {
        this.mbrM = mbrM;
        this.mbrD = mbrD;
        this.attributes=attributes;
        this.oauth=true;
    }

    public Boolean isOAuthLogin() {
        return oauth;
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return mbrM.getLgnPswd();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return mbrD.getMbrNm();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

    public String returnUserTypeForNm(String userTypeCd){

        String userTypeNm = "";

        if(userTypeCd.equals("001")){
            userTypeNm = RoleType.ADMIN.name();
        }else if(userTypeCd.equals("002")){
            userTypeNm = RoleType.USER.name();
        }else if(userTypeCd.equals("003")){
            userTypeNm = RoleType.BEST.name();
        }else if(userTypeCd.equals("004")){
            userTypeNm = RoleType.SELLER.name();
        }else if(userTypeCd.equals("005")){
            userTypeNm = RoleType.ANONYMOUS.name();
        }

        return userTypeNm;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collectors = new ArrayList<>();
        collectors.add(() -> "ROLE_" + returnUserTypeForNm(mbrM.getMbrTypeCd()));
        return collectors;
    }

    @Override
    public Map<String, Object> getAttributes() {
        // TODO Auto-generated method stub
        return attributes;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "몰라";
    }
}
