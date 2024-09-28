package com.lcwd.rating.controllers;

import com.lcwd.rating.entities.Rating;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class TestApi {

    @GetMapping("/hit")
    public String Runtest(){
        return "i am workign";
    }

}
