package com.company;

//Create a method called displayHighScorePosition
//it should take a player's name as a parameter, and a 2nd parameter as a position in the high score table
//You should display the player's name along with a message like "managed to get into position" and the
//position they earned and a further message "on the high score table".
//
//Create a 2nd method called calculateHighScorePosition
//it should be sent one argument only, the player score
//it should return an int
//the return data should be
//1 if the score is >= 1000
//2 if the score is >= 500 and < 1000
//3 if the score is >= 100 and < 500
//4 in all other cases
//call both methods and display the results of the following
//a score of 1500, 900, 400, and 50

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jane", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sammy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Vita", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into "
                + highScorePosition + " position and is on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
