package com.heodae.homepage.home.api.echo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EchoControllerTest {
    @Test
    void idTest(){
        String productId = "sel_TM20211102000138192_TM00005165_2-sel_TM20211102000138192_TM00005166_1";

        String[] split = productId.split("-");

        Map<String, List<String>> map = new HashMap<>();

        for(String s : split){
            String[] arr = s.split("_");

            String pid = arr[1];
            String oId = arr[2];
            String qty = arr[3];
            String option = oId + "_" + qty;

            List<String> optionList = new ArrayList<>();

            map.put(pid, addOptionList(option));
        }

        map.forEach((s, s2) -> {
            System.out.println("key >> " + s + ", value >>> " + s2);
        });


    }

    private List<String> addOptionList(String option) {
        return null;
    }

}