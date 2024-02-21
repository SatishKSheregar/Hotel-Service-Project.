package com.rating.Rating__Service.service;

import com.rating.Rating__Service.entities.Rating;
import java.util.List;

public interface Service {

    // create
    Rating create(Rating rating);


    // get all
    List<Rating> getAllRating();


    // get By userId

    List<Rating> getByUserId(String UserId);

    // get by HotelId
    List<Rating> getByHotelId(String HotelId);


}
