/*
File: KiloToPound
Name: Jacob Yousif
*/

public class KiloToPound{
   public static void main(String[] args){
      
      System.out.printf("%-15s %s", "Kilograms", "Pounds");
      
      double pounds;
      int kilos = 1;
      while(kilos <= 19){
         System.out.printf("\n%9d %12.2f", kilos, (kilos * 2.2));
         kilos += 2;
      }
   }
}