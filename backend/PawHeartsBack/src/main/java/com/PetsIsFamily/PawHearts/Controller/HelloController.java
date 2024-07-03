package com.PetsIsFamily.PawHearts.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("mensagem", "Bem-vindo ao sistema de adoção de animais!");
		return "hello";
	}
}
