//write a java program to day checking with switch case

import java.util.Scanner;
class switchcase
  {
    public static void main(String args[])
    {
      int day;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of day:");
      day=sc.nextInt();
      switch(day){
        case 1:
          System.out.println("its monday");
          break;
        case 2:
          System.out.println("its tuesday");
          break;
        case 3:
          System.out.println("its wednesday");
          break;
           case 4:
          System.out.println("its thursday");
          break;
        case 5:
          System.out.println("its friday");
          break;
        case 6:
          System.out.println("its saturday");
          break;
        case 7:
          System.out.println("its sunday");
          break;
        default:
          System.out.println("wrong choice");
      }
      
    }  
      
      
  }
  