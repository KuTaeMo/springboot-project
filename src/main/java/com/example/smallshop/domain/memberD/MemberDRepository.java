package com.example.smallshop.domain.memberD;

import com.example.smallshop.domain.memberD.MemberDEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDRepository extends JpaRepository<MemberDEntity, String> {

}
