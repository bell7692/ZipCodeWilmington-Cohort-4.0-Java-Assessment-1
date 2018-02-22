package com.zipcodewilmington.assessment1.part1;

import sun.jvm.hotspot.runtime.solaris_x86.SolarisX86JavaThreadPDAccess;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        if (handSign.equals(ROCK) ){
            return PAPER;
        }
        else if (handSign.equals(PAPER) ){
            return SCISSOR;
        }
        else if (handSign.equals(SCISSOR) ){
            return ROCK;
        }
        return "Error in Argument";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign.equals(SCISSOR) ){
            return PAPER;
        }
        else if (handSign.equals(ROCK) ){
            return SCISSOR;
        }
        else if (handSign.equals(PAPER) ){
            return ROCK;
        }
        return "Error in Argument";
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if(handSignOfPlayer1.equals(handSignOfPlayer2)) {
            return "Draw, No Winner!";
        }
        else if(getWinningMove(handSignOfPlayer1).equals(getLosingMove(handSignOfPlayer2))){
           return handSignOfPlayer1;
       }
       else if(getWinningMove(handSignOfPlayer2).equals(getLosingMove(handSignOfPlayer1))){
           return handSignOfPlayer2;
       }
       return "Error in Argument";

//        String winningHand = "";
//        if(handSignOfPlayer1.equals(handSignOfPlayer2)){
//            winningHand = "Draw, No Winner!";
//        }
//        else if(handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(SCISSOR)){
//            winningHand = handSignOfPlayer1;
//        }
//        else if(handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(ROCK)){
//            winningHand = handSignOfPlayer1;
//        }
//        else if(handSignOfPlayer1.equals(SCISSOR) && handSignOfPlayer2.equals(PAPER)){
//            winningHand = handSignOfPlayer1;
//        }
//        else if(handSignOfPlayer2.equals(ROCK) && handSignOfPlayer1.equals(SCISSOR)){
//            winningHand = handSignOfPlayer2;
//        }
//        else if(handSignOfPlayer2.equals(PAPER) && handSignOfPlayer1.equals(ROCK)){
//            winningHand = handSignOfPlayer2;
//        }
//        else if(handSignOfPlayer2.equals(SCISSOR) && handSignOfPlayer1.equals(PAPER)){
//            winningHand = handSignOfPlayer2;
//        }
//
//        return winningHand;
    }
}
