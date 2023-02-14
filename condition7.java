//write a java program to  big value of three numbers using conditional statements 

import java.util.Scanner;
class condition7
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of a:");
      a=sc.nextInt();
      System.out.println("enter the value of b:");
      b=sc.nextInt();
      System.out.println("enter the value of c:");
      c=sc.nextInt();
      if(a>b){
      if(a>c){
        System.out.println("a is big value");
        
      }
      }
      else{
        if(b>c){
        System.out.println("b is the big value");
      }
        else{
          System.out.println("c is the big value");
        }
      
      }
  }
  }