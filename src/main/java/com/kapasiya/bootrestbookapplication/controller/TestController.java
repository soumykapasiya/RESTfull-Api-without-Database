package com.kapasiya.bootrestbookapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController
{


    @GetMapping("/test")
    public String testController()
    {
        return "testing Controller";
    }


}
