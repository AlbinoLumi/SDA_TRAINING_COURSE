package com.sda.classess;

public class Cars {

    public String mark;
    private String color;
    private int serialNumber;

    public Cars(String mark, String color, int serialNumber){
        this.mark = mark;
        this.color=color;
        this.serialNumber = serialNumber;
    }
    public String getMark(){
        return mark;
    }
    public String getColor(){
        return color;
    }
    public int getSerialNumber(){
        return serialNumber;
    }

    public void setMark(String mark){
        this.mark = mark;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

}
