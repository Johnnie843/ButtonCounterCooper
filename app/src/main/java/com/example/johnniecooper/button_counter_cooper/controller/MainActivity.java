package com.example.johnniecooper.button_counter_cooper.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.johnniecooper.button_counter_cooper.R;
import com.example.johnniecooper.button_counter_cooper.model.Counter;


public class MainActivity extends AppCompatActivity {


    private Counter counter;
    private Button incrementButton;
    private Button deincrementButton;
    private Button resetButton;
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = (Button) this.findViewById(R.id.incrementButton);
        countView = (TextView) this.findViewById(R.id.currentCount);
        counter = new Counter();

    }

    public void incrementCount(View view){

        counter.incrementCount();
        countView.setText(counter.countToString());

    }
    public void deincrementCount(View view){

        counter.deincrementCount();
        countView.setText((counter.countToString()));

    }
    public void resetCount(View view){

        counter.resetCount();

        countView.setText(counter.countToString());

    }

}

