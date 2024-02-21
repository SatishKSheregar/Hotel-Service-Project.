package com.hotelservice.Hotel__Service.serviceimpl;

import com.hotelservice.Hotel__Service.entities.Hotel;
import com.hotelservice.Hotel__Service.exception.ResourceNotFoundException;
import com.hotelservice.Hotel__Service.repositories.Repository;
import com.hotelservice.Hotel__Service.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    Repository repository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        String hotelId= UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return repository.save(hotel);
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        return repository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel+ {hotelId}+ Not found"));
    }

    @Override
    public List<Hotel> getAllHotel() {
        return repository.findAll();
    }
}
