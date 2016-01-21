package HomeWork.HashMapHW;

/*
 Create a method
 I give you words
 by calling a method
 then I'll tell you to give me frequency listings
 Eg. if I call you twice with the word abc
 You print out abc,2
 */

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    Map<String, Integer> myWords = new HashMap<>();

    void wordInput(String word) {
        Integer current = myWords.get(word);
        if (current == null) {
            current = 0;
        }
        current++;

        myWords.put(word, current);
        System.out.println("Word: " + word + " has count: " + current);
    }

}
