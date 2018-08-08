package com.demo.springmvc.web;

import com.demo.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("view")
    public String view(){
        demoService.throwException();
        return "d1";
    }



    @PostMapping("data")
    public Map<String,Object> data(){
        Map<String,Object> result = new HashMap<>();
        result.put("foo","bar");
        demoService.throwException();
        return result;
    }
}
