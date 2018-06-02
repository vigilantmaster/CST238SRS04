package com.cst238srs04tanelhelmik.cst238srs04tanel;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Integer> buttonList;
    public List<Cell> myCells;
    String winner = null;
    MainActivity mainActivity;
    public Board(List<Integer> buttonList, MainActivity mainActivity)
    {
        this.buttonList = buttonList;
        this.mainActivity = mainActivity;
    }
    //function to generate default cells and their default values
    public void GenerateCellList()
    {
        myCells = new ArrayList<>();
        for (int i = 0; i < 121; i++) {
            if(i == 0 || i == 10 || i == 110 || i == 120)// then invalid cell
            {
                Cell newCell = new Cell();
                newCell.team = "invalid";
                newCell.filled = true;
                newCell.cellID = i;
                myCells.add(newCell);
            }
            else if (i > 0 && i < 10) // first row excluding invalid cells
            {
                addCell(i,"blue");
            }
            else if ( i > 10 && i < 22)// second row
            {
                addCell(i, "red");
            }
            else if ( i > 21 && i < 33)// third row
            {
                addCell(i, "blue");
            }
            else if ( i > 32 && i < 44)// fourth row
            {
                addCell(i, "red");
            }
            else if ( i > 43 && i < 55)// fifth row
            {
                addCell(i, "blue");
            }
            else if ( i > 54 && i < 66)// sixth row
            {
                addCell(i, "red");
            }
            else if ( i > 65 && i < 77)// seventh row
            {
                addCell(i, "blue");
            }
            else if ( i > 76 && i < 88)// eighth row
            {
                addCell(i, "red");
            }
            else if ( i > 87 && i < 99)// ninth row
            {
                addCell(i, "blue");
            }
            else if ( i > 98 && i < 110)// tenth row
            {
                addCell(i, "red");
            }
            else if ( i > 110 && i < 120)// last eleventh row excluding invalid cells
            {
                addCell(i, "blue");
            }
        }
    }
    void addCell (int i, String team)
    {
        if(i%2 == 0) //i is even
        {
            Cell newCell = new Cell();
            newCell.team = "blank";
            newCell.filled = false;
            newCell.cellID = i;
            myCells.add(newCell);
        }
        else // i is odd
        {
            Cell newCell = new Cell();
            newCell.team = team;
            newCell.filled = true;
            newCell.cellID = i;
            myCells.add(newCell);
        }
    }
    void ResetButtonImages()
    {
        for (int i = 0; i < 121; i++) {
            if(i == 0 || i == 10 || i == 110 || i == 120)// then invalid cell
            {
             mainActivity.imageButtons.get(i).setImageResource(R.drawable.download);

            }
            else if (i > 0 && i < 10) // first row excluding invalid cells
            {
                if (i%2 != 0)mainActivity.imageButtons.get(i).setImageResource(R.drawable.bluecurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 10 && i < 22)// second row
            {
                if (i%2 != 0) mainActivity.imageButtons.get(i).setImageResource(R.drawable.redcurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 21 && i < 33)// third row
            {
                if (i%2 != 0) mainActivity.imageButtons.get(i).setImageResource(R.drawable.bluecurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 32 && i < 44)// fourth row
            {
                if (i%2 != 0)  mainActivity.imageButtons.get(i).setImageResource(R.drawable.redcurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 43 && i < 55)// fifth row
            {
                if (i%2 != 0)  mainActivity.imageButtons.get(i).setImageResource(R.drawable.bluecurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 54 && i < 66)// sixth row
            {
                if (i%2 != 0)  mainActivity.imageButtons.get(i).setImageResource(R.drawable.redcurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 65 && i < 77)// seventh row
            {
                if (i%2 != 0)   mainActivity.imageButtons.get(i).setImageResource(R.drawable.bluecurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 76 && i < 88)// eighth row
            {
                if (i%2 != 0) mainActivity.imageButtons.get(i).setImageResource(R.drawable.redcurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 87 && i < 99)// ninth row
            {
                if (i%2 != 0)  mainActivity.imageButtons.get(i).setImageResource(R.drawable.bluecurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 98 && i < 110)// tenth row
            {
                if (i%2 != 0) mainActivity.imageButtons.get(i).setImageResource(R.drawable.redcurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
            else if ( i > 110 && i < 120)// last eleventh row excluding invalid cells
            {
                if (i%2 != 0)  mainActivity.imageButtons.get(i).setImageResource(R.drawable.bluecurtain);
                else    mainActivity.imageButtons.get(i).setImageResource(R.drawable.downloadtemp);
            }
        }
    }
}
