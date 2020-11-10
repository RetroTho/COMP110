/*
File: FutureInvestment
Name: Jacob Yousif
*/

public class FutureInvestment{
   public static void main(String[] args){
      
      double price = 10000;
      double fourYear = 0;
      int year;
      for(year=1;year<14;year++){
         price = (price * 0.05) + price;
         if(year == 10){
            System.out.printf("Tuition in ten years is $%.2f%n", price);
         }
         if(year >= 10){
            fourYear += price;
         } 
      } 
      
      System.out.printf("The four-year tuition in ten years is $%.2f%n", fourYear);
   }
}