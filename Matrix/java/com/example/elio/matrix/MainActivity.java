package com.example.elio.matrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout[] mtxLayout = new LinearLayout[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //-------------------------------------------------------Creating Layouts--------------------------------------------------------
        //Creating Main Linear
        LinearLayout lnrLayoutMain = new LinearLayout(this);
        lnrLayoutMain.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lnrLayoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        setContentView(lnrLayoutMain,lnrLayoutParam);

        //Creating LinearFirst to hold 2 buttons
        LinearLayout lnrLayoutFirst = new LinearLayout(this);
        lnrLayoutFirst.setOrientation(LinearLayout.HORIZONTAL);
        lnrLayoutFirst.setGravity(17);
        lnrLayoutMain.addView(lnrLayoutFirst);

        //Creating Linear to hold 2 buttons
        LinearLayout lnrLayoutSecond = new LinearLayout(this);
        lnrLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        lnrLayoutSecond.setGravity(17);
        lnrLayoutMain.addView(lnrLayoutSecond);

        //Creating Linear to hold Table
        for (int i = 0; i < 3; i++) {
            mtxLayout[i] = new LinearLayout(this);
            LinearLayout.LayoutParams mtxLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            mtxLayoutParams.gravity = Gravity.CENTER;
            mtxLayout[i].setLayoutParams(mtxLayoutParams);
            lnrLayoutMain.addView(mtxLayout[i]);
        }


        //----------------------------------------------------Creating Buttons and TextViews----------------------------------------------------------------
        //Initializing params for the buttons
        LinearLayout.LayoutParams btnParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        btnParams.setMargins(50,50,50,50);

        //Creating button Diagonals
        Button diagonalsButton = new Button(this);
        diagonalsButton.setText("Diagonals");
        diagonalsButton.setTextSize(20);
        diagonalsButton.setLayoutParams(btnParams);
        lnrLayoutFirst.addView(diagonalsButton);

        //Creating button Border
        Button borderButton = new Button(this);
        borderButton.setText("Border");
        borderButton.setTextSize(20);
        borderButton.setLayoutParams(btnParams);
        lnrLayoutFirst.addView(borderButton);

        //Creating button Upper part
        Button upTriButton = new Button(this);
        upTriButton.setText("Triangle up");
        upTriButton.setTextSize(20);
        upTriButton.setLayoutParams(btnParams);
        lnrLayoutSecond.addView(upTriButton);

        //Creating button Down part
        Button downTriButton = new Button(this);
        downTriButton.setText("Triangle down");
        downTriButton.setTextSize(20);
        downTriButton.setLayoutParams(btnParams);
        lnrLayoutSecond.addView(downTriButton);

        //Creating the 9 TextViews
        final TextView[] tvArray = new TextView[9];
        for (int i = 0; i < 9; i++) {
            tvArray[i] = new TextView(this);
        }
        //Initializing attributes to each TextView
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 3; j++) {
                tvArray[i + j].setWidth(300);
                tvArray[i + j].setHeight(300);
                tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_regular, getTheme()));
                mtxLayout[i / 3].addView(tvArray[i + j]);
            }
        }

        //-----------------------------------------------------Setting onClick functions------------------------------------------------------
        //Setting onClick for button Diagonals
        diagonalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 3; j++) {
                        tvArray[i + j].setWidth(300);
                        tvArray[i + j].setHeight(300);
                        tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_regular, getTheme()));

                        //Main diagonal
                        if(i/3 == j)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                        //Secondary diagonal
                        if(i/3 + j == 2)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                    }
                }
            }
        });

        //Setting onClick for button Border
        borderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 3; j++) {
                        tvArray[i + j].setWidth(300);
                        tvArray[i + j].setHeight(300);
                        tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_regular, getTheme()));

                        //Rows and Columns when i and j are 0 or max
                        if(i == 0 || i/3 == 2 || j == 0 || j == 2)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                    }
                }
            }
        });

        //Setting onClick for button UpPart
        upTriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 3; j++) {
                        tvArray[i + j].setWidth(300);
                        tvArray[i + j].setHeight(300);
                        tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_regular, getTheme()));

                        //Main diagonal
                        if(i/3 == j)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                        //When j index is bigger when i index per array
                        if(j > i/3)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                    }
                }
            }
        });

        //Setting onClick for button DownPart
        downTriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 9; i += 3) {
                    for (int j = 0; j < 3; j++) {
                        tvArray[i + j].setWidth(300);
                        tvArray[i + j].setHeight(300);
                        tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_regular, getTheme()));

                        //Main diagonal
                        if(i/3 == j)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                        //When i index is bigger then j index per array
                        if(i/3 > j)
                            tvArray[i + j].setBackground(getResources().getDrawable(R.drawable.cell_painted, getTheme()));
                    }
                }
            }
        });
    }
}
