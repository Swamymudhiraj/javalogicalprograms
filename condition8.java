//write a java program to check the age of a person using conditional statements

import java.util.Scanner;
class condition8
  {
    public static void main(String args[])
    {
      int age;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of age:");
      age=sc.nextInt();
     
      if(age>=13){
        if(age<=19){
  
        System.out.println("this person is teenager");
        }
      }
       else 
        {
        System.out.println("this person is an adult");
      }
      }
        
      
  }
  