package com.exercises.response_status;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
public class MyController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/makeCoffe")
    public String makeCoffe() {
        return "Serving cofee";
    }

    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    @GetMapping("/makeTea")
    public String makeTea() {
        return "I am a teapot";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @GetMapping("/notFound")
    public String notFound() {
        return "Not found";
    }


}
