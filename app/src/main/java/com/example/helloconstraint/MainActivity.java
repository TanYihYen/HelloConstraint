package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private TextView button1;
    private TextView button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button2 = (TextView) findViewById(R.id.button_zero);
        button1 = (TextView) findViewById(R.id.button_count);

    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,"TAN YIH YEN 19WMD05449",Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;

        button2.setBackgroundColor(Color.MAGENTA);
        view.setBackgroundColor(Color.GREEN);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));




    }


    public void ResetCount(View view){
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        button1.setBackgroundColor(Color.BLUE);
        button2.setBackgroundColor(Color.GRAY);


    }
}