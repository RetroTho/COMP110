/*
File: Lab10
Name: Jacob Yousif
*/

public class Lab10{
   public static void main(String[] args){
   
      for(int i=10000; i<=100000; i+=10000){
         System.out.println("The pi value for " + i + " is " + pi(i));
      }
      
      System.out.println("The sum of digits for 1024 is " + sumDigits(1024));
      System.out.println("The sum of digits for 634 is " + sumDigits(634));
      System.out.println("The square root of 12 is " + sqrt(12));
      System.out.println("The square root of 4 is " + sqrt(4));
     
   }
     
   public static double pi(int i){
   
      double pi = 0.0;
      double sum = 0.0;
      
      while(i >= 1){
         sum += (Math.pow(-1, i + 1)) / ((2 * i) - 1);
         i--;
      }
      
      pi = 4 * sum;
      return pi;
      
   }

   public static int sumDigits(int n){
   
      int sum = 0;
      
      while(n != 0){
         sum += n % 10;
         n /= 10;
      }
      
      return sum;
      
   }
   public static double sqrt(long n){
   
		double lastGuess = 1;
		double nextGuess = (lastGuess + n / lastGuess) / 2; 

		while (Math.abs(nextGuess - lastGuess) > 0.0001){
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
      
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
         
   }
}