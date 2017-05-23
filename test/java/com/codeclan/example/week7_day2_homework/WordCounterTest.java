package com.codeclan.example.week7_day2_homework;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by richardedwards on 23/05/2017.
 */
public class WordCounterTest {

    @Test
    public void canCreateWordCounter(){
        WordCounting counter = new WordCounter();
    }

    @Test
    public void canCountWordsInText(){
        WordCounting counter = new WordCounter();
        String text = "The lazy brown cat jumped over the massive purple cow";

        assertEquals(10, counter.countWordsIn(text));
    }

}