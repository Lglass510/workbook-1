package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

// Question 1:
// declare variables here
        double bobSalary = 50000;
        double garySalary = 200000.99;
// then code solution
        double highestSalary = Math.max(bobSalary, garySalary);

// then use System.out.println() to display results
        System.out.println("Highest salary is:" + highestSalary);
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE

        double carPrice = 1900;
        double truckPrice = 32000;
        double cheapestVehicle = Math.min(truckPrice, carPrice);
        System.out.println("Cheapest Vehicle is:"+ cheapestVehicle);

     double circleDiameter = 14.5;
     double cirlceRaduis = 7.25;
     double area = Math.PI * cirlceRaduis * cirlceRaduis;
        System.out.println("The area of the circle is" + area);


      double num = 5;
      double squareRoot = Math.sqrt(5);
        System.out.println("Square root equals " + squareRoot);

        double pointA = 5;
        double pointB = 10;


        double pointC = 85;
        double pointD = 50;

        double distance = Math.sqrt(Math.pow(pointC - pointA,2) + Math.pow(pointD - pointB,2));
        System.out.println("Distance equals " + distance);
    }




}
