package com.exercises.SpringBoot.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ComputerController {
    private Computer computer = new Computer(
        "PC-Albert","MSI Nvidia RTX 3070", "Intel i5 7900", "Asus Rog 16GB DDR5"
    );

    @ResponseBody
    @GetMapping("/computer")
    public Computer getComputer() {
        return computer;
    }
}
