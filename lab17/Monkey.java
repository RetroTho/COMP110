/*
File: Monkey
Name: Jacob Yousif
*/

import java.util.*;
public class Monkey{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String word;
      
      do{
         System.out.print("Enter a word (max 6 characters): ");
         word = (input.nextLine()).toLowerCase();
      } while(word.length() > 6);
      
      long startTime = System.currentTimeMillis();
   
      String s = "";
      for(int i = 0; i < word.length(); i++){
         s = s + generate();
      }
      
      System.out.println("Initial random string: " + s);  
   
      while(!s.equals(word)){
         s = s.substring(1) + generate();
      }
      System.out.println("Final string is: " + s);
   
      long endTime = System.currentTimeMillis();
      long time = (endTime - startTime) / 1000;
      
      System.out.println("Took " + time + " seconds");
   }
   
   public static char generate(){
      Random random = new Random();
      
      char randLowerChar = (char)(random.nextInt(26) + 97);
      return randLowerChar;
   }
}