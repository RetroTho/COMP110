/*
File: Sum
Name: Jacob Yousif
*/

public class Sum{
   public static void main(String[] args){
      int sumOdd = 0;
      int sumEven = 0;
      
      int i = 1;
      while(i <= 10){
         int num = (int)(Math.random() * 91 + 10);
         if(num % 2 == 0){
            sumEven += num;
         }
         else{
            sumOdd += num;
         }
         System.out.println(num);
         i++;
      }
      
      System.out.println("The sum of the even numbers is " + sumEven);
      System.out.println("The sum of the odd numbers is " + sumOdd);
   }
}