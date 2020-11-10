/*
File: CostOfDriving
Name: Jacob Yousif
Description: Prompts the user to enter the distance to drive, the fuel efficiency of the car in miles per gallon, and the price per gallon then displays the cost of the trip.
*/

import java.util.*;
public class CostOfDriving{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the driving distance: ");
      double distance = input.nextDouble();
      System.out.print("Enter the miles per gallon: ");
      double mpg = input.nextDouble();
      System.out.print("Enter the price per gallon: ");
      double costpg = input.nextDouble();
      double gallons = distance / mpg;
      double endcost = costpg * gallons;
      
      System.out.println("The cost of driving is " + endcost);
   }
}