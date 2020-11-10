/*
File: TestMoney2
Name: Jacob Yousif
*/

import java.util.*;
public class TestMoney2{
   public static void main (String[] args) {
      Money[] moneyValues = new Money[15];
      Random random = new Random();
    
      for(int i = 0; i < moneyValues.length; i++){
         moneyValues[i] = new Money(random.nextInt(30) + 1, random.nextInt(100));
      }
    
      System.out.println("Random money values: ");
      Money sum = new Money();
    
      int count = 0;
      for(int i = 0; i < moneyValues.length; i++){
         System.out.print(moneyValues[i] + " ");
        
         count++;
         
         if(count == 10){
            System.out.println();
            count = 0;
         }
        
         sum.setDollars(sum.getDollars() + moneyValues[i].getDollars());
         sum.setCents(sum.getCents() + moneyValues[i].getCents());
      }
      
      sum.setDollars(sum.getDollars() + (sum.getCents() / 100));
      sum.setCents(sum.getCents() % 100);
      
      System.out.print("\n\nThe sum is " + sum);
   }
}