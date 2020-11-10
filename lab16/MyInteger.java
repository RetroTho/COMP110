/*
File: MyInteger
Name: Jacob Yousif
*/

public class MyInteger{
   private int value;
      
   public MyInteger(int v){
      this.value = v;
   }
   
   public int getValue(){
      return this.value;
   }
   
   public boolean isEven(){
      if((this.value % 2) == 0){
         return true;
      }
      return false;
   }
   
   public boolean isOdd(){
      if((this.value % 2) != 0){
         return true;
      }
      return false;
   }
   
   public boolean isPrime(){
      if(this.value <= 1){ 
         return false; 
      }
           
      for(int i = 2; i < this.value; i++){
         if(this.value % i == 0){
            return false; 
         }
      }
      return true; 
   }
   
   public static boolean isEven(int v){
      if((v % 2) == 0){
         return true;
      }
      return false;
   }
   
   public static boolean isOdd(int v){
      if((v % 2) != 0){
         return true;
      }
      return false;
   }
   
   public static boolean isPrime(int v){
      if(v <= 1){ 
         return false; 
      }
           
      for(int i = 2; i < v; i++){
         if(v % i == 0){
            return false; 
         }
      }
      return true; 
   }

   public static boolean isEven(MyInteger v){
      if((v.getValue() % 2) == 0){
         return true;
      }
      return false;
   }
   
   public static boolean isOdd(MyInteger v){
      if((v.getValue() % 2) != 0){
         return true;
      }
      return false;
   }
   
   public static boolean isPrime(MyInteger v){
      if(v.getValue() <= 1){ 
         return false; 
      }
           
      for(int i = 2; i < v.getValue(); i++){
         if(v.getValue() % i == 0){
            return false; 
         }
      }
      return true; 
   }

   public boolean equals(int v){ 
      if(this.value == v){
         return true;
      }
      return false;
   }
   
   public boolean equals(MyInteger v){ 
      if(this.value == v.getValue()){
         return true;
      }
      return false;
   }
   
   public static int parseInt(char[] vList){
      return Integer.parseInt(new String(vList));
   }
   
   public static int parseInt(String v){
      return Integer.parseInt(v);
   }
   
}