package com.example.smallshop.web;

import com.example.smallshop.domain.memberM.MemberMEntity;
import com.example.smallshop.domain.memberM.MemberMRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/memberM")
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
