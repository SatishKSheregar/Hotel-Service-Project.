package com.hotelservice.Hotel__Service.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(){
        super("Hotel not Found");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
