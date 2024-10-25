package com.example.board.repository;

import com.example.board.entity.Board;
import com.example.board.repository.impl.BoardCRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface BoardRepository extends JpaRepository<Board, Long>,
        QuerydslPredicateExecutor<Board>, BoardCRepository {
}
