package com.example.johnniecooper.button_counter_cooper.model;

import java.util.ArrayList;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void incrementCount(){
        this.count++;
    }
    public void deincrementCount(){
        this.count--;
    }

    public void resetCount() {
        this.count = 0;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String countToString(){

        return Integer.toString(this.count);
    }
}
