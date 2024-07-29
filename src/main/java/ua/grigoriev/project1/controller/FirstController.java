package ua.grigoriev.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/")
public class FirstController {
    @GetMapping()
    public String helloPage() {
       return "welcome";
    }
}
