package shop.mtcoding.aopstudy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import shop.mtcoding.aopstudy.dto.JoinDTO;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class UserController {

    // Valid AOP 발동
    @PostMapping("/valid")
    public String join(@Valid JoinDTO joinDTO, Errors errors){
        System.out.println(joinDTO);
        return "ok";
    }
}
