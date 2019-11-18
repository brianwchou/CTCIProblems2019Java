package com.chapter.one;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsUniqueTest {
    
    @Test
    public void isStringMadeOfUniqueCharacters_withNonUniqueString_shouldFail() {
        assertFalse(IsUnique.isStringMadeOfUniqueCharacters("hello world!"));
    }

    @Test
    public void isStringMadeOfUniqueCharacters_withUniqueString_shouldPass() {
        assertTrue(IsUnique.isStringMadeOfUniqueCharacters("blue harit"));
    }

    @Test
    public void isStringMadeOfUniqueCharacters_withEmptyString_shouldPass() {
        assertTrue(IsUnique.isStringMadeOfUniqueCharacters(""));
    }

}