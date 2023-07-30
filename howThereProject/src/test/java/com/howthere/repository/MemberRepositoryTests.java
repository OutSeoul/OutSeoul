package com.howthere.repository;

import com.howthere.app.entity.Member;
import com.howthere.app.repository.MemberRepository;
import com.howthere.app.type.LoginType;
import com.howthere.app.type.MemberType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void saveTest() {
        Member member = Member.builder()
                .memberEmail("member@email")
                .memberName("name")
                .memberProfile("2023/07/25.png")
                .memberBirthDate(LocalDateTime.now())
                .memberType(MemberType.MEMBER)
                .memberLoginType(LoginType.KAKAO)
                .memberBirthDate(LocalDateTime.now())
                .build();

        memberRepository.save(member);
    }

}