package com.learning;

import java.util.HashMap;

public class RemoveDuplicateCharactersInAString {
    public String removeDupes(String stringWithDupes) {

        // how would you do this?

        HashMap<Character, Boolean> charMap = new HashMap();

        StringBuilder builder = new StringBuilder();

        for (int i=0;i<stringWithDupes.length();i++) {
            char currentChar = stringWithDupes.charAt(i);

            if (!charMap.containsKey(currentChar)) {
                builder.append(currentChar);
                charMap.put(new Character(currentChar), true);
            }
        }

        return builder.toString();
    }
}
