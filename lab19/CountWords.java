/*
File: CountWords
Name: Jacob Yousif
*/

import java.io.*;

public class CountWords{
   public static void main(String[] args){
      int charCount = 0;
      int wordCount = 0;
      int lineCount = 0;
      
      BufferedReader file = null;
       
      try{ 
         file = new BufferedReader(new FileReader(args[0]));
          
         String currentLine = file.readLine();
          
         while (currentLine != null){
            lineCount++;
            String[] words = currentLine.split("\\s+");            
            wordCount = wordCount + words.length;
             
            for (String word : words){   
               charCount = charCount + word.length();
            }
             
            currentLine = file.readLine();
         }
          
         System.out.println("File " + args[0] + " has");
         System.out.println(charCount + " Characters");
         System.out.println(wordCount + " Words");
         System.out.println(lineCount + " Lines");
      } 
      
      catch (IOException e){
         e.printStackTrace();
      }
      
      finally{
         try{
            file.close();
         }
         catch (IOException e){
            e.printStackTrace();
         }
      }
   }   
}
