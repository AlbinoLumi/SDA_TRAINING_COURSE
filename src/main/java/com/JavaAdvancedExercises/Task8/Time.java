package com.JavaAdvancedExercises.Task8;

import java.text.SimpleDateFormat;

public class Time {
    private int hours;
    private int min;
    private int seconds;

    public Time() {
    }

    public Time(int hours, int min, int seconds) {
        this.hours = hours;
        this.min = min;
        this.seconds = seconds;
    }



    public void setTime(int hours, int min, int seconds) {
        hours = ((hours > 0 && hours < 24) ? hours : 0);
        min = ((min > 0 && min < 60) ? min : 0);
        seconds = ((seconds > 0 && seconds < 60) ? seconds : 0);


    }
    public String timeToString(){
        return ( ( hours == 12 || hours == 0 ) ? 12 : hours % 12 ) +
                ":" + ( min < 10 ? "0" : "" ) + min +
                ":" + ( seconds < 10 ? "0" : "" ) + seconds +
                ( hours < 12 ? " AM" : " PM" );
    }


}