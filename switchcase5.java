//write a java program to Given number is even or odd using switch case

import java.util.Scanner;
class switchcase5
  {
    public static void main(String args[])
    {
      int num;
      boolean a;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      num=sc.nextInt();
    
      switch(num%2){
        case 0:
          System.out.println("the given number is even");
          break;
         case 1:
          System.out.println("the given number is odd");
          break;
        default:
          System.out.println("wrong choice");       
      }
        
      }
    }
  