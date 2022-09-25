package com.DesignPatters.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
  private  int temp;
  private  int humidity;

  List<Observer> observerList = new ArrayList<Observer>();


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
        weatherHasChanged();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        weatherHasChanged();
    }

    public WeatherStation(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }
    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observerList.remove(observer);
    }
    public void weatherHasChanged(){
        for(Observer observer: observerList){
            observer.notifyObserver();
        }
    }
}
