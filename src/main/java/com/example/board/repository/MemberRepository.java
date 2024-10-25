package com.example.board.repository;

import com.example.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {

    //QueryMethod

    //Optional<Member> findByEmailAndPw(String email, String pw);
    @Query("select m from Member m where m.email=:email1 and m.pw=:pw1")
    Optional<Member> findByEmailAndPw(@Param("email1") String email, @Param("pw1") String pw);
}
