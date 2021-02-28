package com.myapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HelloWorldController   
{  

public String hello()   
{  
return "Hello this is Sonu Seoran!";  
}  
}  