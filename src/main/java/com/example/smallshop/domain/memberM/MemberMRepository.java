package com.example.smallshop.domain.memberM;

import com.example.smallshop.domain.memberM.MemberMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMRepository extends JpaRepository<MemberMEntity, String> {

}
