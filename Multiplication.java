// write a java program to print the multiplication table using while loop.

import java.util.Scanner;
class Multiplication{
  public static void main(String args[]){
    int i=1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    while(i<=10){
     System.out.println(num+"*"+i+"="+num*i);
      i++;
    }
  }
}