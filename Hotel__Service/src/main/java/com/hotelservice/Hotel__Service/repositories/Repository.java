package com.hotelservice.Hotel__Service.repositories;

import com.hotelservice.Hotel__Service.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Hotel,String> {

}
