package com.example.docker.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.dto.SampleData;

@RestController
public class ApiController {

    @GetMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
    public SampleData index() {
        SampleData data = new SampleData();
        data.setName("太郎");
        data.setAge(30);
        return data;
    }
}
