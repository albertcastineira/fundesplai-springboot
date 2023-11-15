package com.exercises.request_mapping.get_mapping;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    /*  Answer:
    *   The difference between request mapping and get mapping, post...
    *   is that with request mapping the endpoint is allowed to receive all
    *   types of petitions. And using the specific one like getMapping you can
    *   restrict for specific usage.
    * */

    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Albert", "Castiñeira", 22);
    }

    @PostMapping("/person")
    public String createPerson() {
        return "New person was created!";
    }

    @DeleteMapping("/person")
    public String deletePerson() {
        return "A person was deleted!";
    }

    @PutMapping("/person")
    public String updatePerson() {
        return "A person was updated!";
    }
}
