package com.rating.Rating__Service.serviceimpl;



import com.rating.Rating__Service.entities.Rating;
import com.rating.Rating__Service.repositories.Repository;
import com.rating.Rating__Service.service.Service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    Repository repository;


    @Override
    public Rating create(Rating rating) {
        String ratingId= UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        return repository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return repository.findAll();
    }

    @Override
    public List<Rating> getByUserId(String UserId) {
        return repository.findByUserId(UserId);
    }

    @Override
    public List<Rating> getByHotelId(String HotelId) {
        return repository.findByHotelId(HotelId);
    }
}
