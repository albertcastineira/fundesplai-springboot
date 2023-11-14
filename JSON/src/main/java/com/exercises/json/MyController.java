package com.exercises.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MyController {
    // Object Method
    @ResponseBody
    @RequestMapping("/")
    public TextToJSON objectMethod() {
        return new TextToJSON("This is a json");
    }

    @ResponseBody
    @RequestMapping(path = "/json", produces = "application/json")
    public String stringAsJsonMethod() {
        return "{\"message\": \"This is a json\"}";
    }

    @ResponseBody
    @RequestMapping("/json2")
    public ObjectNode objectNodeMethod() {
        ObjectMapper objMapper = new ObjectMapper();
        ObjectNode objNode = objMapper.createObjectNode();
        objNode.put("message","This is a json");
        return objNode;
    }

    @ResponseBody
    @RequestMapping("/json3")
    public ResponseEntity<String> responseEntityMethod() {
        final HttpHeaders hhtpHeaders = new HttpHeaders();
        hhtpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<String>
                ("{\"message\": \"This is a json\"}",
                hhtpHeaders,
                HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping("/json3")
    public ResponseEntity<String> randomStatus() {
        final HttpHeaders hhtpHeaders = new HttpHeaders();
        hhtpHeaders.setContentType(MediaType.APPLICATION_JSON);
        Random random = new Random();
        int randomStatus = random.nextInt(2);
        if(randomStatus > 1) {
            return new ResponseEntity<String>
                    ("{\"message\": \"0\"}",
                            hhtpHeaders,
                            HttpStatus.OK);
        } else {
            return new ResponseEntity<String>
                    ("{\"message\": \"1\"}",
                            hhtpHeaders,
                            HttpStatus.I_AM_A_TEAPOT);
        }

    }
}
