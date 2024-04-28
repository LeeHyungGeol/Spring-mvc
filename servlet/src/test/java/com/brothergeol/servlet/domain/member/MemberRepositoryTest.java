package com.brothergeol.servlet.domain.member;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    public void save() throws Exception {
        // given
        Member member = new Member("brothergeol", 28);

        // when
        Member saved = memberRepository.save(member);

        // then
        Member findMember = memberRepository.findById(saved.getId());
        assertThat(saved).isEqualTo(findMember);
    }
    
    @Test
    public void findAll() throws Exception {
        // given
        Member member1 = new Member("member1", 28);
        Member member2 = new Member("member2", 28);

        memberRepository.save(member1);
        memberRepository.save(member2);

        // when
        List<Member> members = memberRepository.findAll();

        // then
        assertThat(members.size()).isEqualTo(2);
        assertThat(members).contains(member1, member2);
    }
}