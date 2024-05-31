package com.ksilisk.virdeanoffresourceserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:5173/")

public class TestController {
    @GetMapping
    public String get() {
        return "hellow resource server";
    }
}
