//Write a JAVAprogram to check whether a year is leap year or not.
import java.util.Scanner;
class practice2
  {
    public static void main(String args[])
    {
      double year;
     Scanner sc = new Scanner(System.in);
      System.out.println("enter the year:");
      year=sc.nextDouble();
       //System.out.println("enter the value of y:");
     // y=sc.nextInt();
      //System.out.println("enter the value of z:");
      //z=sc.nextInt();
      if(year%4==0){
        if(year%100==0)
        System.out.println("you entered year is not leap year");
        else 
            System.out.println("its leap year");
      }
      else 
        System.out.println("its not a leap year");
        
      }
   }
