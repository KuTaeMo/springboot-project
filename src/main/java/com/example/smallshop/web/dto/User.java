package com.example.smallshop.web.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    private String mbrKey;
    private String mbrTypeCd;
    private String mbrStatCd;
    private String lgnPswd;
    private String mbrId;
    private String mbrNm;
    private String phoneNum;
    private Date brthDt;
}
