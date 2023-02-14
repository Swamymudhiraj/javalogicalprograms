//Create a program that takes a user's grade as input (A, B, C, D, or F) and prints the corresponding GPA.
import java.util.Scanner;
class practice4
  {
    public static void main(String args[])
    {
      char grd;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the grade of student");
      grd=sc.next().charAt(0);
      if(grd=='A' || grd=='a'){
        System.out.println("This student got 8GPA to 10GPA ");
      } 
        if(grd=='B' || grd=='b'){
          System.out.println("This student got 7GPA to 8GPA");
        }
          if(grd=='C' || grd=='c'){
            System.out.println("This student got 6GPA to 7GPA");
          } 
            if(grd=='D'||grd=='d'){
              System.out.println("This student got 5GPA to 6GPA");
            } if(grd=='F'||grd=='f'){
              System.out.println("This student got failed");
            }
      else {
        System.out.println("you have entered invaild ");
      }
    }
  }