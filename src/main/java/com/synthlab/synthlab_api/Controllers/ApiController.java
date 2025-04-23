package com.synthlab.synthlab_api.Controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ApiController {

    @GetMapping
    public Map<String, String> welcome() {
        return Map.of(
            "status", "🚀",
            "message", "Bienvenido a la API de SynthLab 🔥"
        );
    }
}