package com.codeclan.example.week7_day2_homework;

/**
 * Created by richardedwards on 23/05/2017.
 */

public class WordCounter implements WordCounting {

    String arrayOfWords[];

    public int countWordsIn(String text){
        arrayOfWords = text.split(" ");
        return arrayOfWords.length;
    }
}
