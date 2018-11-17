package com.pawel.loremipsum.controller;

import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    LoremIpsum loremIpsum = new LoremIpsum();

    @GetMapping("/")
    public String generate() {
        return "generator";
    }
    @GetMapping("/text")
    public String text(@RequestParam(required = false) String word,
                       @RequestParam(required = false) Integer amount,
                       ModelMap modelMap) {

        if (word.equals("true")) {
            modelMap.put("lorem", loremIpsum.getWords(amount));
        } else if (word.equals("false")){
            modelMap.put("lorem", loremIpsum.getParagraphs(amount));
        }

        return "generator";
    }
}
