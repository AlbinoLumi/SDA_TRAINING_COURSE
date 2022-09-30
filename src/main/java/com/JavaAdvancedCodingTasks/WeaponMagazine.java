package com.JavaAdvancedCodingTasks;

public class WeaponMagazine {

    private Integer sizeOfMagazine;
    private Integer quantityInMagazine = 0;

    public WeaponMagazine(Integer sizeOfMagazine){
        this.sizeOfMagazine = sizeOfMagazine;

    }
    public  void loadBullet(String bullet){
        Integer bulletInInt = Integer.parseInt(bullet);
        if(bulletInInt + quantityInMagazine <= sizeOfMagazine){
            System.out.println("Bullet loaded successfully");
            quantityInMagazine += bulletInInt;
        }else{
            Integer temp = sizeOfMagazine - quantityInMagazine;
            bulletInInt -= temp;
            System.out.println("Only " + temp + " are loaded successfully !");
            System.out.println(bulletInInt + " is not loaded, because the weapon is fully loaded !");
        }

    }
    public boolean isLoaded(){
        if(quantityInMagazine > 0){
            System.out.println("Weapon has at least one cartridge !");
            return true;
        }else{
            System.out.println("Weapon is not loaded");
            return false;
        }

    }
    public void shoot(){
        if(quantityInMagazine > 0){
            if(quantityInMagazine ==1){
                System.out.println("There is the last bulled in the magazine");
            } else if (quantityInMagazine ==2 ) {
                System.out.println("There is one remaining bullet");

            }
            quantityInMagazine --;
        }else{
            System.out.println("Empty magazine !");
        }
    }
}
