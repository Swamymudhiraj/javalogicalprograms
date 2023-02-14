//Create a program that uses a switch case statement to determine the number of days in a month based on the month number.
// Given number is even or odd

import java.util.Scanner;
class switchcase6
  {
    public static void main(String args[])
    {
      int mont;
      boolean a;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
      mont=sc.nextInt();
    
      switch(mont){
        case 1:
          System.out.println("its january month we have 31 days");
          break;
          case 2:
          System.out.println("its febraury month we have 28 days");
          break;
          case 3:
          System.out.println("its march month we have 30 days");
          break;
          case 4:
          System.out.println("its april month we have 30 days");
          break;
          case 5:
          System.out.println("its may month we have 30 days");
          break;
          case 6:
          System.out.println("its june month we have 30 days");
          break;
          case 7:
          System.out.println("its julay month we have 30 days");
          break;
          case 8:
          System.out.println("its augest month we have 30 days");
          break;
          case 9:
          System.out.println("its september month we have 30 days");
          break;
          case 10:
          System.out.println("its october month we have 30 days");
          break;
          case 11:
          System.out.println("its november month we have 30 days");
          break;
          case 12:
          System.out.println("its december month we have 31 days");
          break;
          default:
          System.out.println("you have entered invalid");
           }
      }
    }
  