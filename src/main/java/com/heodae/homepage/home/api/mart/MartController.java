package com.heodae.homepage.home.api.mart;

import com.heodae.homepage.home.api.common.CommRestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MartController {

    private CommRestTemplate commRestTemplate;

    public MartController(CommRestTemplate commRestTemplate){
        this.commRestTemplate = commRestTemplate;
    }

    @GetMapping("/mart/holiday")
    public String checkMartHoliday(){
        return  commRestTemplate.get("http://localhost:20100/mart/holiday");
    }
}
