/*
File: LeapYear
Name: Jacob Yousif
*/

public class LeapYear{
   public static void main(String[] args){
      int lineCount = 1;
      for(int year = 2001; year <=2100; year++){
         if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            if(lineCount < 10){
               System.out.print(year + " ");
               lineCount++;
            }
            else{
               System.out.println(year + " ");
               lineCount = 1;
            }
         }
      }
   }
}