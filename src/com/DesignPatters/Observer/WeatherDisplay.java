package com.DesignPatters.Observer;

public class WeatherDisplay implements Observer{
    private int temp;
    private int humitidy;

    WeatherStation station;
    public WeatherDisplay(WeatherStation station){
        this.station = station;//duhet qe WeatherDisplay te ket nje stacion ne menyre qe ti marrim informcion

    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumitidy() {
        return humitidy;
    }

    public void setHumitidy(int humitidy) {
        this.humitidy = humitidy;
    }

    public WeatherDisplay(int temp, int humitidy) {
        this.temp = temp;
        this.humitidy = humitidy;
    }
     public void displayWeather(){
         System.out.println("Moti ne ket moment : " +this.temp + "me lageshtire "+ this.humitidy);
     }
    @Override
    public void notifyObserver() {
        this.temp = station.getTemp();
        this.humitidy = station.getHumidity();
        displayWeather();
    }
}
