package com.heodae.homepage.home;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller("/")
public class HomeController {

    @GetMapping
    public String home(Model model){
        System.out.println("home controller");
        return "index";
    }

    @PatchMapping
    public ResponseEntity<String> homet(){
        String st = "etst";

        return new ResponseEntity<>(st, HttpStatus.OK);
    }
}
