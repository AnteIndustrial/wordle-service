package com.ante.wordleservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordleController {

    @GetMapping("/")
    public String getIndex(){
        return "running";
    }
}
