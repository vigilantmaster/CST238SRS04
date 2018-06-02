package com.cst238srs04tanelhelmik.cst238srs04tanel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
//Dynamic Constraint Layout http://www.exaud.com/constraintlayout/

public class MainActivity extends AppCompatActivity {

    List<Integer> buttonList;
    public List<ImageButton> imageButtons;
    MyButtonListener myButtonListener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListener = new MyButtonListener(this, this);
        buildDynamicConstraintLayout();
        TextView textView = findViewById(R.id.textViewPlayerTurn);
        textView.setTextColor(Color.BLUE);
        textView.setText("It's blue's turn");
        Button restartButton = findViewById(R.id.buttonReset);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reload();
            }
        });
        Button hintButton = findViewById(R.id.hintButton);
        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ShowHintActivity();
            }
        });
    }

    void ShowHintActivity()
    {
        Intent Intent = new Intent(this, HintActivity.class);
        startActivity(Intent);
    }

    private void buildDynamicConstraintLayout() {

        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        int deviceWidth = displayMetrics.widthPixels;
        int deviceHeight = displayMetrics.heightPixels;

        // ConstraintLayout I had to add constraint_layout as the id to constraint layout is needed
        ConstraintLayout mainConstraintLayout = findViewById(R.id.constraint_layout);

        //instantiate arrays
        buttonList = new ArrayList<>();
        imageButtons = new ArrayList<>();
        ImageButton button1 = null;
        ConstraintSet constraintSet = new ConstraintSet();
        int buttonHeight = deviceHeight/20, buttonWidth = deviceWidth/14;
        ConstraintLayout lineLayout = findViewById(R.id.l1);
        Drawable image = getDrawable(R.drawable.bluecurtain);


        //create lots of buttons 121 of them
        for (int i = 0; i < 121; i++){

            button1 = new ImageButton(this);
            // Generate an Id and assign it to programmatically created Button
            button1.setId(View.generateViewId());
            button1.setOnClickListener(myButtonListener);
            if(i == 0 || i == 10 || i==110 || i == 120) {
                button1.setImageDrawable(getDrawable(R.drawable.download));
            }
            else if(i%2 != 0)
            {
                button1.setImageDrawable(image);
            }
            else
            {
               button1.setImageDrawable(getDrawable(R.drawable.downloadtemp));
            }
            ViewGroup.LayoutParams newParams;
            newParams = new ViewGroup.LayoutParams(buttonWidth, buttonHeight);
           button1.setLayoutParams(newParams);
            // Add programmatically created Button to ConstraintLayout
            lineLayout.addView(button1);
            //put button id's into  a list of some sort.
            buttonList.add(button1.getId());
            imageButtons.add(button1);
                // Create Rule that states that the START of Button 1 will be positioned at the END of Button 2
            constraintSet.clone(lineLayout);
             if (i == 10)
               {

                  List<Integer> currentSubList = buttonList.subList(0, buttonList.size()); //11
                  int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l1, ConstraintSet.RIGHT,
                           R.id.l1, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l2);
                   image = getDrawable(R.drawable.redcurtain);

               }
               else if(i == 21)
               {
                   List<Integer> currentSubList = buttonList.subList(11, buttonList.size()); //22
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l2, ConstraintSet.RIGHT,
                           R.id.l2, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l3);
                   image = getDrawable(R.drawable.bluecurtain);
               }
               else if(i == 32)
               {


                   List<Integer> currentSubList = buttonList.subList(22, buttonList.size());//33
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l3, ConstraintSet.RIGHT,
                           R.id.l3, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l4);
                   image = getDrawable(R.drawable.redcurtain);
               }
               else if(i == 43)
               {


                   List<Integer> currentSubList = buttonList.subList(33, buttonList.size());//44
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l4, ConstraintSet.RIGHT,
                           R.id.l4, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l5);
                   image = getDrawable(R.drawable.bluecurtain);
               }
               else if(i == 54)
               {


                   List<Integer> currentSubList = buttonList.subList(44, buttonList.size());//55
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l5, ConstraintSet.RIGHT,
                           R.id.l5, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l6);
                   image = getDrawable(R.drawable.redcurtain);
               }
               else if(i == 65)
               {


                   List<Integer> currentSubList = buttonList.subList(55, buttonList.size());//66
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l6, ConstraintSet.RIGHT,
                           R.id.l6, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l7);
                   image = getDrawable(R.drawable.bluecurtain);
               }
               else if(i == 76)
               {


                   List<Integer> currentSubList = buttonList.subList(66, buttonList.size());//77
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l7, ConstraintSet.RIGHT,
                           R.id.l7, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l8);
                   image = getDrawable(R.drawable.redcurtain);
               }
               else if(i == 87)
               {


                   List<Integer> currentSubList = buttonList.subList(77, buttonList.size());//88
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l8, ConstraintSet.RIGHT,
                           R.id.l8, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l9);
                   image = getDrawable(R.drawable.bluecurtain);
               }
               else if(i == 98)
               {


                   List<Integer> currentSubList = buttonList.subList(88, buttonList.size());//99
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l9, ConstraintSet.RIGHT,
                           R.id.l9, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l10);
                   image = getDrawable(R.drawable.redcurtain);
               }
               else if(i == 109)
               {


                   List<Integer> currentSubList = buttonList.subList(99, buttonList.size());//110
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l10, ConstraintSet.RIGHT,
                           R.id.l10, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);
                   lineLayout = findViewById(R.id.l11);
                   image = getDrawable(R.drawable.bluecurtain);
               }
               else if(i == 120)
               {


                   List<Integer> currentSubList = buttonList.subList(110, buttonList.size());//121
                   int[] myInts = toIntArray(currentSubList);

                   constraintSet.createHorizontalChain(
                           R.id.l11, ConstraintSet.RIGHT,
                           R.id.l11, ConstraintSet.LEFT,
                           myInts,
                           null ,
                           ConstraintSet.CHAIN_SPREAD);
                   constraintSet.applyTo(lineLayout);

               }
        }
        myButtonListener.setButtonList(buttonList);
    }


    public int[] toIntArray(List<Integer> list)  {
        int[] ret = new int[list.size()];
        int i = 0;
        for (Integer e : list)
            ret[i++] = e.intValue();
        return ret;
    }
    public void reload() {
       myButtonListener.myBoard.GenerateCellList();
       myButtonListener.myBoard.ResetButtonImages();
       myButtonListener.loseFlagRed = false;
       myButtonListener.loseFlagBlue = false;
       myButtonListener.currentPlayer = "blue";
       TextView myTextView = findViewById(R.id.textViewPlayerTurn);
       myTextView.setTextColor(Color.BLUE);
       myTextView.setText("It's blue's turn");
    }
}
