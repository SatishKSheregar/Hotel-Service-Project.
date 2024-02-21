package com.rating.Rating__Service.repositories;


import com.rating.Rating__Service.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface Repository extends JpaRepository<Rating,String> {

    // Custom find methods
//    @Query(name = "select * from Rating where userid=? ",nativeQuery = true)
    List<Rating> findByUserId(String UserId);
//    @Query(name = "select * from Rating where hotel_d=? ",nativeQuery = true)
    List<Rating> findByHotelId(String HotelId);
}
