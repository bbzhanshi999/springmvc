package com.demo.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {


    public void throwException(){
        throw new ClassCastException("classCast");
    }
}
