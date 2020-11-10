/*
File: Money
Name: Jacob Yousif
*/

public class Money {
   private int dollars;
   private int cents;
   
   public Money(){
      dollars = 0;
      cents = 0;
   }
   
   public Money(int d, int c){
      this.dollars = d;
      this.cents = c;
   }
   
   public int getDollars(){
      return dollars;
   }
   
   public void setDollars(int d){
      this.dollars = d;
   }
   
   public int getCents(){
      return cents;
   }
   
   public void setCents(int c){
      this.cents = c;
   }
   
   public Money add(Money m){
      Money sum = new Money();
      sum.setDollars(this.dollars + m.getDollars());
      
      if(this.cents + m.getCents() >= 100){
         sum.setDollars(sum.getDollars() + 1);
         sum.setCents(this.cents + m.getCents() - 100);
      }
      else{
         sum.setCents(this.cents + m.getCents());
      }
      
      return sum;
   }
   public Money subtract(Money m){
      if(m.getDollars() > dollars){
         return null;
      }
      else if(m.getDollars() == dollars && m.getCents() > cents){
         return null;
      }
      
      Money difference = new Money();
      difference.setDollars(this.dollars - m.getDollars());
      
      if(this.cents - m.getCents() < 0){
         difference.setDollars(difference.getDollars() - 1);
         difference.setCents(-(this.cents - m.getCents()));
      }
      else{
         difference.setCents(this.cents - m.getCents());
      }
      
      return difference;
   }

   public String toString(){
      return String.format("$%1d.%02d", dollars, cents);
   }
}