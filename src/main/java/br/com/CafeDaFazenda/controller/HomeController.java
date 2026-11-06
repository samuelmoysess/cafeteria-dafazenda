package br.com.CafeDaFazenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Página inicial
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Página sobre
    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    // Página de contato
    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }
}