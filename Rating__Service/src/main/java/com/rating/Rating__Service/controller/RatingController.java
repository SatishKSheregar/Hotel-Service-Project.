package com.rating.Rating__Service.controller;



import com.rating.Rating__Service.entities.Rating;
import com.rating.Rating__Service.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    Service service;
    // create

    @PostMapping("/rating")   // https://localhost:8082/rating
    public ResponseEntity<Rating> crate(@RequestBody Rating rating){
        Rating rating1=service.create(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping("rating/all")
    public ResponseEntity<List<Rating>> getRating(){
        return ResponseEntity.ok(service.getAllRating());

    }
    @GetMapping("rating/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(service.getByUserId(userId));

    }
    @GetMapping("rating/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(service.getByHotelId(hotelId));

    }
}
