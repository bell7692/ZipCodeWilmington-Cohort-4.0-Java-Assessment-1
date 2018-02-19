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
        String winningMove = "";
        if (handSign.equals(ROCK) ){
            winningMove = PAPER;
        }
        else if (handSign.equals(PAPER) ){
            winningMove = SCISSOR;
        }
        else if (handSign.equals(SCISSOR) ){
            winningMove = ROCK;
        }
        return winningMove;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingMove = "";
        if (handSign.equals(SCISSOR) ){
            losingMove = PAPER;
        }
        else if (handSign.equals(ROCK) ){
            losingMove = SCISSOR;
        }
        else if (handSign.equals(PAPER) ){
            losingMove = ROCK;
        }
        return losingMove;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winningHand = "";
        if(handSignOfPlayer1.equals(handSignOfPlayer2)){
            winningHand = "Draw, No Winner!";
        }
        else if(handSignOfPlayer1.equals(ROCK) && handSignOfPlayer2.equals(SCISSOR)){
            winningHand = handSignOfPlayer1;
        }
        else if(handSignOfPlayer1.equals(PAPER) && handSignOfPlayer2.equals(ROCK)){
            winningHand = handSignOfPlayer1;
        }
        else if(handSignOfPlayer1.equals(SCISSOR) && handSignOfPlayer2.equals(PAPER)){
            winningHand = handSignOfPlayer1;
        }
        else if(handSignOfPlayer2.equals(ROCK) && handSignOfPlayer1.equals(SCISSOR)){
            winningHand = handSignOfPlayer2;
        }
        else if(handSignOfPlayer2.equals(PAPER) && handSignOfPlayer1.equals(ROCK)){
            winningHand = handSignOfPlayer2;
        }
        else if(handSignOfPlayer2.equals(SCISSOR) && handSignOfPlayer1.equals(PAPER)){
            winningHand = handSignOfPlayer2;
        }

        return winningHand;
    }
}
