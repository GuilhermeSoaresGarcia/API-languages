package br.com.alura.api.languages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguagesController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages") // <--- o "value" pode ser omitido
    public List<Language> languages() {
        return repository.findAll();
    }

}
