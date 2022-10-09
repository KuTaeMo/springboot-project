package com.example.smallshop.domain.productMng;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name="tb_mer_prdmng")
public class ProductMngEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String prdInfoKey;

    @Column(nullable = false)
    private Date frstRegDt;

    @Column(nullable = false)
    private Date lastMdfcnDt;

    public ProductMngEntity(String prdInfoKey, Date frstRegDt, Date lastMdfcnDt) {
        this.prdInfoKey = prdInfoKey;
        this.frstRegDt = frstRegDt;
        this.lastMdfcnDt = lastMdfcnDt;
    }
}
