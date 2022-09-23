package com.courses.springcrud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HellController {
    
    @GetMapping()   
    public @ResponseBody String hello(){
        return "DIOGO SENIOR";
    }
}
