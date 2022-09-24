package com.JavaAdvanced;

public class Bed {
    String name;
    String bedroomType;

    public Bed (){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBedroomType() {
        return bedroomType;
    }

    public void setBedroomType(String bedroomType) {
        this.bedroomType = bedroomType;
    }

    public  Bed (String name, String bedroomType){
        this.name = name;
        this.bedroomType = bedroomType;
    }
}
