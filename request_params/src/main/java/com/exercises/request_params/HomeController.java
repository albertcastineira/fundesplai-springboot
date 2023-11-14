package com.exercises.request_params;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

@RestController
public class HomeController {

    @GetMapping("/welcome")
    public User welcome(@RequestParam(required = false) String name, @RequestParam(required = false) String surname) {
        if(name == null) {
            return new User("Unknown","Unknown");
        } else {
            return new User(name,surname);
        }
    }

    @GetMapping("/params")
    public ResponseEntity<String> handleInfiniteParams(@RequestParam Map<String, String> allParams) {
        StringBuilder response;
        if(!allParams.isEmpty()) {
            response = new StringBuilder("Params: ");
            response.append(allParams);
        } else {
            response = new StringBuilder("Empty params!");
        }
        return ResponseEntity.ok(response.toString());
    }

    @GetMapping("/discotheque")
    public ResponseEntity<String> discotheque(@RequestParam int age) {
        StringBuilder response;
        if(age >= 18) {
            response = new StringBuilder("You can pass!");
        } else {
            response = new StringBuilder("You don't have the required age to enter!");
        }
        return ResponseEntity.ok(response.toString());
    }

    @GetMapping("/headOrTails")
    public ResponseEntity<String> headOrTails(@RequestParam String option) {
        StringBuilder response;
        Random random = new Random();
        int randomCoinToss = random.nextInt(2);
        String randomCoinResult = "";
        if(randomCoinToss == 1) randomCoinResult = "head";
        else randomCoinResult = "tail";

        if(randomCoinResult.equals(option)) {
            response = new StringBuilder("You win");
        } else {
            response = new StringBuilder("You lose");
        }
        return ResponseEntity.ok(response.toString());
    }
}
