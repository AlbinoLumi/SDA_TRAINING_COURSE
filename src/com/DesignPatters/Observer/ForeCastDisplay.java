package com.DesignPatters.Observer;

public class ForeCastDisplay implements Observer{
   private  int oldTemp;
   private int oldHumidity;
   private int newTemp;
   private int newHumidity;

   WeatherStation station;
   public ForeCastDisplay(WeatherStation station){
       this.station = station; //has a - meaning that is using depedency injection because we need to get the temp info.

   }


    @Override
    public void notifyObserver() {
       oldTemp = newTemp;
       oldHumidity = newHumidity; //sepse dua qe ato te parat dua te jen te barabarta me ata te tanishme.

        newTemp = this.station.getTemp();
       newHumidity = this.station.getHumidity();

       printWeatherForecast();


    }
    public void printWeatherForecast(){
        System.out.println("Moti me pare: temp - >  " + oldTemp + " hum - > "+ oldHumidity);
        System.out.println("Moti tani: temp - > " + newTemp + " hum - > "+ newHumidity);
    }
}
