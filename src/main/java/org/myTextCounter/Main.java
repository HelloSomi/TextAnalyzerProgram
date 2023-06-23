package org.myTextCounter;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CountMyText S = new CountMyText();
        System.out.println(" Hi! Welcome to my WordGame Please write your text.");

        String text = scan.nextLine();
        S.checkIfTextContainsStop(text);
        while (!S.getShouldStop()) {

            S.calcNumberOfLines(text);
            S.calcCharacter(text);
            text = scan.nextLine();
            S.checkIfTextContainsStop(text);
        }
        System.out.println(" You have choosed to end the program. ");
        System.out.println(" Your text contains: " + S.getHowManyLine() + " row/rows.");
        System.out.println(" Your text contains: " + S.getNrOfCharacter() + " characters.");

    }
}
