package com.example.smallshop.repository;

import com.example.smallshop.entitiy.MemberMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMRepository extends JpaRepository<MemberMEntity, String> {

}
