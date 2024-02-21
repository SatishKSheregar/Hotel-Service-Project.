package com.hotelservice.Hotel__Service.service;

import com.hotelservice.Hotel__Service.entities.Hotel;

import java.util.List;

public interface Service {

    public Hotel saveHotel(Hotel hotel);

    public Hotel getHotelById(String hotelId);

    public List<Hotel> getAllHotel();
}
