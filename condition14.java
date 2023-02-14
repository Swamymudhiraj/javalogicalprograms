// Write a program that takes a temperature as input and prints out whether it is above or below freezing, as well as whether it is above or below boiling, using nested if statements. 
// freezing point o , boiling point 100
import java.util.Scanner;
class condition14
  {
    public static void main(String args[])
    {
      int tem;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the temparature:");
      tem=sc.nextInt();
     
      if(tem<=0){
        if(tem){
        System.out.println("its a freezing point");
      }
      else{
        System.out.println("above freezing point");
      }
      }
        else {
        if(tem>=100){
          System.out.println("its boiling point");
        }
        else {
          System.out.println("below boiling point");
        }
        }
      
    }
  }