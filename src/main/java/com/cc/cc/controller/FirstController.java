package com.cc.cc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by sttail on 2020/11/1.
 */
@Validated
@RestController("/")
public class FirstController {

    @PutMapping("index")
    public Object first( String aa){
        Map<String,Object> r = new HashMap<>();
        System.out.println(aa);
        r.put("aa","first");
        return r;
    }
    @PostMapping("index")
    public Object postIndex(String aa){
        Map<String,Object> r = new HashMap<>();
        System.out.println(aa);
        r.put("aa","first");
        return r;
    }
}
