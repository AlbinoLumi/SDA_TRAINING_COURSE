package com.DesignPatters.Observer;

public class Client {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(24,50);
        station.setHumidity(60);
        station.setTemp(40);
        WeatherDisplay display = new WeatherDisplay(station);
        station.addObserver(display);
        station.setTemp(65);
        station.setHumidity(80);
        System.out.println("-------------------------------------------------");
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(station);
        station.addObserver(foreCastDisplay);
        station.setTemp(20);
    }
}
