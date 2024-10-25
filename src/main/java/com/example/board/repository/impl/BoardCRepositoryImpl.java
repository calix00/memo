package com.example.board.repository.impl;

import com.example.board.entity.Board;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class BoardCRepositoryImpl extends QuerydslRepositorySupport implements
        BoardCRepository {
    public BoardCRepositoryImpl() {super(Board.class);}


}
