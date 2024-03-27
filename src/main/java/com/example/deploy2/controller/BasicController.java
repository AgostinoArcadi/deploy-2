package com.example.deploy2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
@RequestMapping("/basic")
public class BasicController {

    @GetMapping
    public ResponseEntity<Integer> sumRandomNum() {
        Random rand = new Random();
        Integer first = rand.nextInt(11);
        Integer second = rand.nextInt(11);

        Integer sum = first + second;
        return ResponseEntity.ok().body(sum);
    }
}
