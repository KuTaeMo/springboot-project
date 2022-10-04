package com.example.smallshop.entitiy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name="tb_sys_mbrinfo_d")
public class MemberDEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String mbrKey;

    @Column(nullable = false)
    private String mbrId;

    @Column(nullable = false)
    private String mbrNm;

    @Column(nullable = false)
    private String phoneNum;

    @Column(nullable = false)
    private Date brthDt;

    @Column(nullable = false)
    private Date frstRegDt;
    @Column(nullable = false)
    private Date lastMdfcnDt;

    public MemberDEntity(String mbrKey, String mbrId, String mbrNm, String phoneNum, Date brthDt, Date frstRegDt, Date lastMdfcnDt) {
        this.mbrKey = mbrKey;
        this.mbrId = mbrId;
        this.mbrNm = mbrNm;
        this.phoneNum = phoneNum;
        this.brthDt = brthDt;
        this.frstRegDt = frstRegDt;
        this.lastMdfcnDt = lastMdfcnDt;
    }
}
