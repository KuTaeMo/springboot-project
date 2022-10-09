package com.example.smallshop.domain.productMng;


import com.example.smallshop.domain.productMng.ProductMngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMngRepository extends JpaRepository<ProductMngEntity, String> {

}
