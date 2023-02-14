//Create a program that prompts the user for a day of the week, and then prints out whether it is a weekday or a weekend using conditional statements.
import java.util.Scanner;
class weekdays
  {
    public static void main(String args[])
    {
      String day;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the day");
      day=sc.next();
      switch(day){
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
          System.out.println(" its a week day");
          break;
        case "saturday":
        case "sunday":
          System.out.println("its a weekend");
          break;
        default:
          System.out.println("you have enered invalid");
          break;
          
      }
    }
  }