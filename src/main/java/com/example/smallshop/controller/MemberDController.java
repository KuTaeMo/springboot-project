package com.example.smallshop.controller;

import com.example.smallshop.entitiy.MemberDEntity;
import com.example.smallshop.entitiy.MemberMEntity;
import com.example.smallshop.repository.MemberDRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/memberD")
public class MemberDController {

    private final MemberDRepository memberDRepository;

    /**
     * 멤버 All 조회
     * @return
     */
    @GetMapping("findAllMemberD")
    public List<MemberDEntity> findAllMemberD(){
        return memberDRepository.findAll();
    }

    /**
     * 멤버 단건 조회
     * @return
     */
    @GetMapping("findMemberD/{id}")
    public MemberDEntity findMemberD(@PathVariable String id){
        return memberDRepository.findById(id).orElse(null);
    }
}
