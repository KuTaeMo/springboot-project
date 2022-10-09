package com.example.smallshop.domain.productInfo;

import com.example.smallshop.domain.productInfo.ProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfoEntity, String> {

}
