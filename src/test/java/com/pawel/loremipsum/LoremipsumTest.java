package com.pawel.loremipsum;

import com.pawel.loremipsum.dao.LoremIpsumGenerator;
import com.pawel.loremipsum.model.PawelLoremIpsum;
import com.pawel.loremipsum.model.SvenLoremIpsum;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class LoremipsumTest {
    private static LoremIpsumGenerator loremIpsumGenerator;

    @BeforeClass
    public static void start() {
        loremIpsumGenerator = new SvenLoremIpsum();
    }

    @Test
    public void testGenerator() throws Exception {
        assertFalse(loremIpsumGenerator.getWords(2).isEmpty());
        assertFalse(loremIpsumGenerator.getParagraphs(2).isEmpty());
        assertEquals(2, loremIpsumGenerator.getWords(2).split(("\\s+")).length);
        assertEquals(2, loremIpsumGenerator.getParagraphs(2).split(("\\s+")).length);
        loremIpsumGenerator = new PawelLoremIpsum();
        assertFalse(loremIpsumGenerator.getWords(2).isEmpty());
        assertFalse(loremIpsumGenerator.getParagraphs(2).isEmpty());
        assertEquals(2, loremIpsumGenerator.getWords(2).split(("\\s+")).length);
        assertEquals(100, loremIpsumGenerator.getParagraphs(2).split(("\\s+")).length);
    }
}

