//Write a program that takes a user's input of a year, month, and day, and prints whether the date is a valid date or not. Use nested if statements to determine if the month and day are valid for the given year.
import java.util.Scanner;
class practice7
  {
    public static void main(String args[])
    {
      int year;
      int mont;
      int day;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the year:");
      year=sc.nextInt();
      System.out.println("enter the month :");
      mont=sc.nextInt();
      System.out.println("enter the day:");
      day=sc.nextInt();
     if(year>=1){
       if(mont<=12 && day<=30){
         System.out.println("its valid date");
       }
         else
         System.out.println("invalid date");
       }
      else {
        System.out.println("invalid input");
      }
    }
  }