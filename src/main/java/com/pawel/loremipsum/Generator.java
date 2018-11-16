package com.pawel.loremipsum;

import de.svenjacobs.loremipsum.LoremIpsum;

public class Generator {
    public static void main(String[] args) {
        LoremIpsum loremIpsum = new LoremIpsum();
        System.out.println(loremIpsum.getParagraphs());
    }
}
