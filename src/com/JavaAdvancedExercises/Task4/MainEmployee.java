package com.JavaAdvancedExercises.Task4;

import com.JavaAdvancedExercises.Task4.Employee;

import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary of the employee: ");
        double salary = input.nextDouble();
        System.out.println("Enter the number of hours per day for the employee: ");
        double nrOfHours = input.nextDouble();

        Employee employee = new Employee();

        employee.getInfo(salary, nrOfHours);
        employee.addSalary();
        employee.addWork();
        employee.finalSalary();





        Employee e1 = new Employee(8184,88);
        Employee e2 = new Employee(252,58);
        Employee e3 = new Employee(5886,867);



        Employee[] employees = new Employee[]{e1,e2,e3};

        findTheAverage(employees);





    }
    public static void findTheAverage(Employee employees[]){

        int sum = 0;
        for(int i = 0; i < employees.length; i ++){
            sum +=  employees[i].getSalary();

        }
        double average = sum/ employees.length;

        System.out.println("Average of salaries is : "+average);

    }

}
