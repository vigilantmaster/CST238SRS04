package com.cst238srs04tanelhelmik.cst238srs04tanel;

import java.util.Random;

public class Bot {
    Board myBoard;
    Bot(Board incommingBoard)
    {
        myBoard = incommingBoard;
    }
    int pickRandomCell()
    {
        Boolean valid = false;
        Random randomNumber = new Random();
        int returnInt = randomNumber.nextInt(121);
        while (valid == false  ) {

            if (myBoard.myCells.get(returnInt).filled) {
                returnInt = randomNumber.nextInt(121);
            }
            else
            {
                valid = true;
            }
        }
        return returnInt;
    }
}
