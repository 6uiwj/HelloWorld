package com.helloworld.HW.admin.board.dto;

import lombok.Data;

import java.util.List;

@Data
public class BoardSearch {

    private int page= 1;
    private int limit= 20;

    private String bid;
    private List<String> bids;

    private String bName;
    private boolean active;
}
