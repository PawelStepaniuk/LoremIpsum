package com.pawel.loremipsum.model;

import com.pawel.loremipsum.dao.LoremIpsumGenerator;
import org.springframework.stereotype.Component;

@Component
public class PawelLoremIpsum implements LoremIpsumGenerator {


    private String[] loremIpsumWords = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.".split("\\s");

    @Override
    public String getWords(int amount) {
        {
            int word = 0;
            StringBuilder lorem = new StringBuilder();
            for (int i = 0; i < amount; ++i) {
                lorem.append(this.loremIpsumWords[word]);
                if (i < amount - 1) {
                    lorem.append(' ');
                }
                ++word;
            }
            return lorem.toString();
        }
    }

    @Override
    public String getParagraphs(int amount) {
        StringBuilder lorem = new StringBuilder();

        for (int i = 0; i < amount; ++i) {
            lorem.append("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.");
            if (i < amount - 1) {
                lorem.append("\n\n");
            }
        }
        return lorem.toString();
    }
}
