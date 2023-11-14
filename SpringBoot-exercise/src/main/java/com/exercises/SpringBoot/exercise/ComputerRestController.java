package com.exercises.SpringBoot.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerRestController {
    private Computer computer = new Computer(
            "PC-Albert","MSI Nvidia RTX 3070", "Intel i5 7900", "Asus Rog 16GB DDR5"
    );

    @GetMapping("/computer2")
    public Computer getComputer() {
        return computer;
    }
}
