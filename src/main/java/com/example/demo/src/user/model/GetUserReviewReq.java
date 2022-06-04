package com.example.demo.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GetUserReviewReq {
    private Long userId;
    private Long profileUserId;
    private List<String> evaluation;
    private String order;
    private List<String> region;
    private List<String> category;
    private List<String> priceRange;
    private List<String> parking;
}
