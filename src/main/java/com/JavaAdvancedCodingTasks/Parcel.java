package com.JavaAdvancedCodingTasks;

public class Parcel implements Validator{

    private Integer xLength;
    private Integer yLength;
    private Integer zLength;
    private float weight;
    boolean isExpress;


    public Parcel(){}

    public Parcel(Integer xLength, Integer yLength, Integer zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate(Parcel input) {
        int sum = xLength+yLength+zLength;
        if(sum > 300){
            System.out.println("Shuma eshte me e madhe se 300");
        } else if (xLength <=30|| yLength <=30||zLength<=30) {
            System.out.println("Nje nga vlerat x,y,z eshte me e vogel se 30");
            
        }else if (isExpress == false && weight >30.0){
            System.out.println("Pesha per isExpress false eshte me e madhe se 30");
        }else if (isExpress == true && weight >15.0){
            System.out.println("Pesha per isExpress true eshte me e madhe se 15");
        }else {
            System.out.println("Te gjitha kushtet plotesohen");
        }

        return true;
    }
}
