/*
File: PerfectNumber
Name: Jacob Yousif
*/

public class PerfectNumber{
   public static void main(String[] args){
      
      int perfCount;
      int i;
      int x;
      for(i = 1; i <= 10000; i++){
         perfCount = 0;
         for(x = 1; x <= i; x++){
            if(i % x == 0 && x != i){
               perfCount += x;
            }
         } 
         if(perfCount == i){
            System.out.println(i);
         }
      }
   }
}