//Write a method called "calculateSum" that takes two integers as arguments and returns their sum.

import java.util.Scanner;
class addition{
    int x;
  int add(int a,int b){
    x=a+b;
    //System.out.println("The additon of two numbers is"+x);
    return x;
    
  }
} 
class practice17{
  public static void main(String args[]){
    int a,b,x;
    addition ad=new addition();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a");
    a=sc.nextInt();
    System.out.println("enter the value of b");
    b=sc.nextInt();
    x=ad.add(a,b);
    System.out.println("the addition of two values is:"+x);
  }
}
