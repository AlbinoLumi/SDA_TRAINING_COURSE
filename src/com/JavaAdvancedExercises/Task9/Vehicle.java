package com.JavaAdvancedExercises.Task9;

public class Vehicle {
    private String name;
    private Integer engineCc;
    private String model;

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEngineCc() {
        return engineCc;
    }

    public void setEngineCc(Integer engineCc) {
        this.engineCc = engineCc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(String name, Integer engineCc, String model) {
        this.name = name;
        this.engineCc = engineCc;
        this.model = model;


    }


}
class Owner extends Vehicle{
    private String name;
    private Integer CNICnumber;
    private double phoneContact;

    public Owner() {
    }




   public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }


    public Integer getCNICnumber() {
        return CNICnumber;
    }

    public void setCNICnumber(Integer CNICnumber) {
        this.CNICnumber = CNICnumber;
    }

     public double getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(double phoneContact) {
        this.phoneContact = phoneContact;
    }

    public Owner(String name, Integer CNICnumber, long phoneContact) {
        this.name = name;
        this.CNICnumber = CNICnumber;
        this.phoneContact = phoneContact;
    }
}

