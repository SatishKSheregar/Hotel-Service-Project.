package com.hotelservice.Hotel__Service.controller;

import com.hotelservice.Hotel__Service.entities.Hotel;
import com.hotelservice.Hotel__Service.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    Service service;

    @PostMapping("/hotel")  // http://localhost:8082/hotel
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveHotel(hotel));
    }
    @GetMapping("hotel/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        return ResponseEntity.ok(service.getHotelById(hotelId));
    }
    @GetMapping("hotel/all")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        return  ResponseEntity.ok(service.getAllHotel());
    }
}
