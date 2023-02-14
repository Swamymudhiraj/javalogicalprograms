//write a java program to find the even numbers of a given numbers using loops

import java.util.Scanner;
class evennum{
  public static void main(String args[]){
    int i=1;
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n:");
    num=sc.nextInt();
    while(i<=num){
      if(i%2==0){
        System.out.println(i);
      }
      i++;
    }
  }
}