package com.ClassExercise;

public class Poem {

    String creator;
    private int stropheNumbers;

    public Poem(){}





    public Poem(String creator, int stropheNumbers) {
        this.creator= creator;
        this.stropheNumbers = stropheNumbers;


    }

    public String getCreator(){
        return creator;
    }
    public int getStropheNumbers(){
        return stropheNumbers;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }
    public void setStropheNumbers(int stropheNumbers){
        this.stropheNumbers = stropheNumbers;
    }

}
