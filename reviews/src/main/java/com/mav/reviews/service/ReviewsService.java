package com.mav.reviews.service;

import com.mav.reviews.pojo.Ratings;
import com.mav.reviews.pojo.Reviews;
import com.mav.reviews.service.client.RatingsFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {

    @Autowired
    private RatingsFeignClient rfc;

  public Reviews getReviews(String versionId){
      Reviews review = new Reviews();
      review.setComment("[Good one,for budding entrepreneurs.]");
      if(versionId.equalsIgnoreCase("V2")){
          Ratings rating = rfc.getRatings();
          review.setColor("Black");
          review.setRating(rating.getRating());
      }else if(versionId.equalsIgnoreCase("V3")){
          Ratings rating = rfc.getRatings();
          review.setColor("Red");
          review.setRating(rating.getRating());
      }

      return review;

  }
}
