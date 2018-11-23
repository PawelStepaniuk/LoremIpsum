package com.pawel.loremipsum.controller;

import com.pawel.loremipsum.model.PawelLoremIpsum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private PawelLoremIpsum loremIpsum;

    @GetMapping("/")
    public String generate() {
        return "generator";
    }

    @PostMapping("/text")
    public String text(@RequestParam(required = false) String word,
                       @RequestParam(required = false) Integer amount,
                       ModelMap modelMap) {

        if (word.equals("words")) {
            modelMap.put("lorem", loremIpsum.getWords(amount));
        } else if (word.equals("paragraphs")) {
            modelMap.put("lorem", loremIpsum.getParagraphs(amount));
        }

        return "generator";
    }
}
