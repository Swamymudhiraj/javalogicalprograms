// print the fibonacci series of a given number

import java.util.Scanner;
class fibonacci{
  public static void main(String args[]){
    int x1=0,x2=1,x3,i,num;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    num=sc.nextInt();
    System.out.println(x1);
    System.out.println(x2);
    for(i=2;i<num;i++){
      x3=x1+x2;
      System.out.println(x3);
      x1=x2;
      x2=x3;
    }
  }
}