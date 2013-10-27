package com.learning;

import static junit.framework.TestCase.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: paulkelly
 * Date: 19/09/2013
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicateCharactersInAStringTest {

    @org.junit.Test
    public void shouldRemoveAllDuplicatesInAString() {

        String stringWithDupes = "aabcdde";
        RemoveDuplicateCharactersInAString removeDupes = new RemoveDuplicateCharactersInAString();

        assertTrue(removeDupes.removeDupes(stringWithDupes).equals("abcde"));

        stringWithDupes = "112345";
        assertTrue(removeDupes.removeDupes(stringWithDupes).equals("12345"));

    }

}
