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
@Entity(name="tb_mer_prdinfo")
public class ProductInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String prdInfoKey;

    @Column(nullable = false)
    private String prdSellerKey;

    @Column(nullable = false)
    private String prdSctCd;

    @Column(nullable = false)
    private int prdCst;

    @Column(nullable = false)
    private String prdNm;

    // 기본형타입(Primitive Type)은 null 값을 담을수 없기 떄문에 참조형타입(Reference Type)으로 변경
    @Column(nullable = false)
    private Double prdPrfScore;

    @Column(nullable = false)
    private String prdImg;

    @Column(nullable = false)
    private char prdScrnYn;

    @Column(nullable = false)
    private Date frstRegDt;
    @Column(nullable = false)
    private Date lastMdfcnDt;

    public ProductInfoEntity(String prdInfoKey, String prdSellerKey, String prdSctCd, int prdCst, String prdNm, Double prdPrfScore, String prdImg, char prdScrnYn, Date frstRegDt, Date lastMdfcnDt) {
        this.prdInfoKey = prdInfoKey;
        this.prdSellerKey = prdSellerKey;
        this.prdSctCd = prdSctCd;
        this.prdCst = prdCst;
        this.prdNm = prdNm;
        this.prdPrfScore = prdPrfScore;
        this.prdImg = prdImg;
        this.prdScrnYn = prdScrnYn;
        this.frstRegDt = frstRegDt;
        this.lastMdfcnDt = lastMdfcnDt;
    }
}
