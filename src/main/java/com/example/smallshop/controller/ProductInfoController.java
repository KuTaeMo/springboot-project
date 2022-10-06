package com.example.smallshop.controller;


import com.example.smallshop.entitiy.ProductInfoEntity;
import com.example.smallshop.repository.ProductInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prdInfo")
public class ProductInfoController {

    private final ProductInfoRepository productInfoRepository;

    /**
     * 상품 All 조회
     * @return
     */
    @GetMapping("findAllPrdInfo")
    public List<ProductInfoEntity> findAllPrdInfo(){
        return productInfoRepository.findAll();
    }

    /**
     * 상품 단건 조회
     * @return
     */
    @GetMapping("findPrdInfo/{id}")
    public ProductInfoEntity findPrdInfo(@PathVariable String id){
        return productInfoRepository.findById(id).orElse(null);
    }
}
