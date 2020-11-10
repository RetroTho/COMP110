/*
File: Investment
Name: Jacob Yousif
Description: Reads in investment amount, annual interest rate, and the number of years, and displays the future investment value
*/

import java.util.*;
public class Investment{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the investment amount: ");
      double amount = input.nextDouble();
      System.out.print("Enter the annual interest rate in percentage: ");
      double yearrate = input.nextDouble();
      System.out.print("Enter the number of years: ");
      double years = input.nextDouble();
      double monthrate = yearrate / 1200;
      double endvalue = amount * Math.pow((1 + monthrate),(years * 12));
      
      System.out.println("The accumulated value is " + endvalue);
   }
}