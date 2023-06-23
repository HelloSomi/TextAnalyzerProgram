package org.myTextCounter;

public class CountMyText {
    private String text ="";
    private String textStop= "stop";
    private int nrOfLine=0;
    private int nrOfCha=0;
    private boolean shouldStop= false;



    public  CountMyText(){


    }
    public int getHowManyLine() {

        return nrOfLine= nrOfLine;
    }

    public void calcNumberOfLines(String myLines ) {
        nrOfLine = (int) (nrOfLine + myLines.lines().count());
    }


    public int getNrOfCharacter() {
        return nrOfCha;

    }
    public int calcCharacter(String myText) {

        return nrOfCha = nrOfCha+ myText.length();

    }


    public boolean checkIfTextContainsStop(String myString){
        if (myString.equals("stop")){
            shouldStop = true;

        }
        return shouldStop;
    }

    public boolean getShouldStop() {
        return shouldStop;
    }
}

