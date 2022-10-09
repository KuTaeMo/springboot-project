package com.example.smallshop.domain.memberM;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name="tb_sys_mbrinfo_m")
public class MemberMEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String mbrKey;

    @Column(nullable = false)
    private String mbrTypeCd;

    @Column(nullable = false)
    private String mbrStatCd;

    @Column(nullable = false)
    private String lgnPswd;

    @Column(nullable = false)
    private Date frstRegDt;

    @Column(nullable = false)
    private Date lastMdfcnDt;

    public MemberMEntity(String mbrKey, String mbrTypeCd, String mbrStatCd, String lgnPswd, Date frstRegDt, Date lastMdfcnDt) {
        this.mbrKey = mbrKey;
        this.mbrTypeCd = mbrTypeCd;
        this.mbrStatCd = mbrStatCd;
        this.lgnPswd = lgnPswd;
        this.frstRegDt = frstRegDt;
        this.lastMdfcnDt = lastMdfcnDt;
    }
}
