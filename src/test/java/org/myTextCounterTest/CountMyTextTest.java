package org.myTextCounterTest;
//import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.myTextCounter.CountMyText;

import static org.junit.jupiter.api.Assertions.*;

public class CountMyTextTest {
    CountMyText text = new CountMyText();
    int line;

    @Test
    void test_Get_How_Many_Line() {
        line = 0;
        assertEquals(line, text.getHowManyLine());

    }

    @Test
    void test_Calc_Number_Of_Lines() {
        String lines = "Hello ";
        int expectedLines = 1;
        text.calcNumberOfLines(lines);
        int actualLines = text.getHowManyLine();
        assertEquals(expectedLines, actualLines);

    }

    @Test
    void test_Calc_Two_Number_Of_Lines(){
        String lines = "Hello \n Ow my god" ;
        int expectedLines = 2;
        text.calcNumberOfLines(lines);
        int actualLines = text.getHowManyLine();
        assertEquals(expectedLines,actualLines);


    }

    @Test
    void test_Get_Nr_Of_Character() {
        int expectedNrOfCharacters = 0;
        assertEquals(expectedNrOfCharacters, text.getNrOfCharacter());

    }

    @Test
    void test_Calc_Character() {
        String word = "Hello";
        int expectedCharacters = 5;

        assertEquals(expectedCharacters, text.calcCharacter(word));
    }

    @Test
    void test_Check_If_Text_Contains_Stop() {
        String myWord = "stop";
        boolean result = text.checkIfTextContainsStop(myWord);
        assertTrue(result);
        /* String myWord = " Hello";
        boolean result = text.checkIfTextContainsStop(myWord);
        assertFalse(result);*/

    }

    @Test
    void test_If_Method_GetShouldStop_Works_As_Expected() {
        boolean expectedValue = false;
        boolean actualValue = text.getShouldStop();

        assertEquals(expectedValue,actualValue, "OK");

    }

}