/*
File: Fractions
Name: Jacob Yousif
*/

import java.util.*;
public class Fractions{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter numerator: ");
      int n = input.nextInt();
      System.out.print("Enter denominator: ");
      int d = input.nextInt();
      
      if((n % d) == 0){
         System.out.println(n + "/" + d + " is an improper fraction and it can be reduced to " + (n / d));
      }
      else if(((n % d) != 0) && (n > d)){
         System.out.println(n + "/" + d + " is an improper fraction and its mixed fraction is " + (n / d) + " + " + (n % d) + "/" + d);
      }
      else if(((n % d) != 0) && (n < d)){
         System.out.println(n + "/" + d + " is a proper fraction");
      }
      
      System.out.println("");
   }
}