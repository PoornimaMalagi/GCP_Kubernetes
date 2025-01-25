package com.mav.ratings.controller;

import com.mav.ratings.pojo.Ratings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RatingsController {

    @GetMapping("ratings")
    public Ratings getRatings(){
        Ratings rating = new Ratings();
        rating.setRating("2");
        return rating;
    }
}
