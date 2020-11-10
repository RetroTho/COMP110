/*
File: Loan
Name: Jacob Yousif
*/

import java.util.*;
public class Loan{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter loan amount: ");
      double amount = input.nextDouble();
      System.out.print("Enter number of years: ");
      double years = input.nextDouble();
      System.out.print("Enter annual interest rate: ");
      double yearRate = input.nextDouble();
      
      double monthRate = yearRate / 1200;
      
      double monthAmount = amount * monthRate / (1 - 1 / Math.pow(1 + monthRate, years * 12));
      double totalAmount = monthAmount * years * 12;
      
      System.out.printf("The monthly payment is %.2f%n", monthAmount);
      System.out.printf("The total payment is %.2f%n", totalAmount);
      System.out.printf("%-10s %-10s %-11s %s %n", "Payment#", "Interest", "Principal", "Balance");
      
      double interest;
      double principal;
      int i;
      for(i=1;i<=years * 12;i++){
         interest = monthRate * amount;
         principal = monthAmount - interest;
         amount = amount - principal;
         System.out.printf("%-10s $%-9.2f $%-10.2f $%.2f %n", i, interest, principal, amount);
      }
   }
}