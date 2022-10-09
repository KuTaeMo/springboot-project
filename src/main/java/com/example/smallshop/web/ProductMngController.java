package com.example.smallshop.web;



import com.example.smallshop.domain.productMng.ProductMngEntity;
import com.example.smallshop.domain.productMng.ProductMngRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prdMng")
public class ProductMngController {

    private final ProductMngRepository productMngRepository;

    /**
     * 상품 All 조회
     * @return
     */
    @GetMapping("findAllPrdMng")
    public List<ProductMngEntity> findAllPrdMng(){
        return productMngRepository.findAll();
    }

    /**
     * 상품 단건 조회
     * @return
     */
    @GetMapping("findPrdMng/{id}")
    public ProductMngEntity findPrdMng(@PathVariable String id){
        return productMngRepository.findById(id).orElse(null);
    }
}
