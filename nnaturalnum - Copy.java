//write a java program to  print the n natural numbers of a given number using while loop.

import java.util.Scanner;
class nnaturalnum{
  public static void main(String args[]){
    int i=1;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    n=sc.nextInt();
    while(i<=n){

      System.out.println(i);
      i++;
    }
  }
}