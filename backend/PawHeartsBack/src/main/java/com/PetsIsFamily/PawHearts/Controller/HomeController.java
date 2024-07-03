package com.PetsIsFamily.PawHearts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PetsIsFamily.PawHearts.Classes.Pets;
import com.PetsIsFamily.PawHearts.Repositórios.PetsRepository;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private PetsRepository repository;

    @GetMapping("/")
    public String home(Model model) {
        List<Pets> pets = (List<Pets>) repository.findAll();
        model.addAttribute("Animais", pets);
        return "home";
    }
}