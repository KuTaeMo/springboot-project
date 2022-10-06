package com.example.smallshop.repository;


import com.example.smallshop.entitiy.ProductMngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMngRepository extends JpaRepository<ProductMngEntity, String> {

}
