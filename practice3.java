//Write a program that takes a user's age as input and prints whether they are a teenager or not.
import java.util.Scanner;
class practice3
  {
    public static void main(String args[])
    {
      int age;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the age of person");
      age=sc.nextInt();
      if(age>=15 && age<=17){
        System.out.println("This person is teenager");
      }
      else {
        System.out.println("he is not a teenager");
      }
    }
  }