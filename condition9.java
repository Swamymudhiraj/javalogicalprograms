// write a java program to find out the day of giving input using conditional statements.

import java.util.Scanner;
class condition9
  {
    public static void main(String args[])
    {
      int day;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of day:");
      day=sc.nextInt();
      if(day==1){
        System.out.println("Its a monday");
        }
      else if(day==2){
        System.out.println("Its tuesday");
      }
      else if(day==3){
       System.out.println("Its wednesday");
      }
      else if(day==4){
        System.out.println("Its thursday ");
      }
      else if(day==5){
        System.out.println("Its friday");
      }
      else if(day==6){
        System.out.println("Its saturday");
      } 
      else if(day==7){
        System.out.println("Its sunday");
      } 
      else {
        System.out.println("Its invalid you have entered");
      }
      
    }  
      
      
  }
  