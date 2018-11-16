package com.pawel.loremipsum.controller;

import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
LoremIpsum loremIpsum = new LoremIpsum();
    @GetMapping("/")
    public String generate(){
        return "generator";
    }
    @GetMapping("/text")
    public String text(@RequestParam(required = false) int words,int paragraphs,  ModelMap modelMap){
        if(words<1){
            modelMap.put("lorem","Podaj liczbe wyrazów do wygenerowania");
        } else {
            modelMap.put("lorem",loremIpsum.getWords(words));

        }
        return "generator";
    }
}
