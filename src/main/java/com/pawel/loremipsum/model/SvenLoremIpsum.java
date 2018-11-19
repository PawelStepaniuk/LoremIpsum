package com.pawel.loremipsum.model;

import com.pawel.loremipsum.dao.LoremIpsumGenerator;
import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.stereotype.Component;

@Component
public class SvenLoremIpsum implements LoremIpsumGenerator {

    private LoremIpsum loremIpsum = new LoremIpsum();

    @Override
    public String getWords(int amount) {
        return loremIpsum.getWords(amount);
    }

    @Override
    public String getParagraphs(int amount) {
        return loremIpsum.getWords(amount);
    }
}
