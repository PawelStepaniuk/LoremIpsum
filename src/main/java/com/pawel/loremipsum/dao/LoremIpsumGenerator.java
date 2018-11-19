package com.pawel.loremipsum.dao;

public interface LoremIpsumGenerator {
    String getWords(int amount);

    String getParagraphs(int amount);
}
