package com.example.elio.colors;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.txtView);
    }

    public void button_MakeRed(View view) {
        Resources resources = getResources();
        int color = resources.getColor(R.color.colorRed, getTheme());
        textView.setTextColor(color);
        String textAll = resources.getString(R.string.the_color_you_chose);
        String textRed = resources.getString(R.string.red);
        textView.setText(textAll+" "+textRed);
    }

    public void button_MakeGreen(View view) {
        Resources resources = getResources();
        int color = resources.getColor(R.color.colorGreen, getTheme());
        textView.setTextColor(color);
        String textAll = resources.getString(R.string.the_color_you_chose);
        String textGreen = resources.getString(R.string.green);
        textView.setText(textAll+" "+textGreen);
    }

    public void button_MakeBlue(View view) {
        Resources resources = getResources();
        int color = resources.getColor(R.color.colorBlue, getTheme());
        textView.setTextColor(color);
        String textAll = resources.getString(R.string.the_color_you_chose);
        String textBlue = resources.getString(R.string.blue);
        textView.setText(textAll+" "+textBlue);
    }
}

