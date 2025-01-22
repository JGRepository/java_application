package com.example.projeto.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalControle {

    @GetMapping("/admin")
    public String acessarPrincipal() {
        return "admin/home";
    }

}
