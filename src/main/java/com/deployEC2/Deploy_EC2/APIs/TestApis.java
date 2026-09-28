package com.deployEC2.Deploy_EC2.APIs;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestApis {

    public TestApis() {
        System.out.println("TestApis constructor called");
    }

    @PostMapping("/post")
    public String postTest() {
        return "POST API is working";
    }

    @GetMapping("/get")
    public int getSum(@RequestParam int a, @RequestHeader int b) {
        return a + b;
    }
}
