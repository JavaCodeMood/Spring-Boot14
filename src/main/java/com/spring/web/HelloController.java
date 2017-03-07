package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.BlogProperties;


@RestController
public class HelloController {
	@Autowired
	private BlogProperties blogProperties;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
    @RequestMapping("/blog")
    public String blog(){
    	return "name->"+blogProperties.getName()+
    			" title->"+blogProperties.getTitle()+
    			" desc->"+blogProperties.getDesc()+
    			" value->"+blogProperties.getValue()+
    			" number->"+blogProperties.getNumber()+
    			" bignumber->"+blogProperties.getBignumber()+
    			" test1->"+blogProperties.getTest1()+
    			" test2->"+blogProperties.getTest2();
    }

}