package com.sis324.citas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Esto devuelve el nombre de la vista que quieres mostrar (por ejemplo, index.html)
    }
}
