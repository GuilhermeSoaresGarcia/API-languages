package br.com.alura.api.languages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguagesController {

    @GetMapping(value="/language-java")
    public String getMethodName() {
        return "Oi, Java!";
    }
}
