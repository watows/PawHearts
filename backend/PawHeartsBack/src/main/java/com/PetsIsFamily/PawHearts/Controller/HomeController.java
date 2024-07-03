package com.PetsIsFamily.PawHearts.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PetsIsFamily.PawHearts.Repositórios.PetsRepository;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PetsRepository repository;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}