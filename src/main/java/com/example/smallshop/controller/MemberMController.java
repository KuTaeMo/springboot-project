package com.example.smallshop.controller;

import com.example.smallshop.entitiy.MemberMEntity;
import com.example.smallshop.repository.MemberMRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberMController {

    private final MemberMRepository memberMRepository;

    /**
     * 멤버 All 조회
     * @return
     */
    @GetMapping("findAllMemberM")
    public List<MemberMEntity> findAllMemberM(){
        return memberMRepository.findAll();
    }

    /**
     * 멤버 단건 조회
     * @return
     */
    @GetMapping("findMemberM/{id}")
    public MemberMEntity findMemberM(@PathVariable String id){
        return memberMRepository.findById(id).orElse(null);
    }
}
