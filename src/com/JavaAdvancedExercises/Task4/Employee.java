package com.JavaAdvancedExercises.Task4;

public class Employee {

  private  double salary;
  private double numberOfHours;

    public Employee(){};

    public Employee(double salary, double numberOfHours) {
        this.salary = salary;
        this.numberOfHours = numberOfHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }




    void  getInfo(double salary, double numberOfHours){
        this.salary = salary;
        this.numberOfHours = numberOfHours;
    }
    void addSalary(){
        if (salary < 500){
            salary += 10;
        }
    }
   void addWork(){
        if(numberOfHours > 6){
            salary +=5;
        }
   }
   void finalSalary(){
       System.out.println("The final salary of employee is : " + salary + " $ ");
   }

}
