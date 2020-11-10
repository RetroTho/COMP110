/*
File: QuadraticEquation
Name: Jacob Yousif
*/

import java.util.*;
public class QuadraticEquation{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a, b, and c: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double x;
      double y;
      
      if((Math.pow(b, 2) - (4 * a * c)) < 0){
         System.out.println("The equation has no real roots.");
      }
      else if((Math.pow(b, 2) - (4 * a * c)) == 0){
         x = (-1 * b) / (2 * a);
         System.out.println("The equation has one root which is " + x);
      }
      else if((Math.pow(b, 2) - (4 * a * c)) > 0){
         x = ((-1 * b) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
         y = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
         System.out.println("The equation has two roots which are " + x + " and " + y);
      }
   }
}