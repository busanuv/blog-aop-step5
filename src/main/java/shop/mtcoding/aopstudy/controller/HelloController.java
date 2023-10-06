package shop.mtcoding.aopstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.aopstudy._core.annotation.Hello;

@RestController
public class HelloController {

    @GetMapping("/hello/v1")
    public String v1(){
        return "v1";
    }

    @Hello
    @GetMapping("/hello/v2")
    public String v2(){
        return "v2";
    }
}
