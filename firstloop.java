// write a java program to  print n natural numbers using methods and loop

import java.util.Scanner;
class firstLoop{
  int i=1;
  void nnaturalNumbers(int num){
    while(i<=num){
       System.out.println(i);
      i++;
    }
  }
}
class firstloop{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    firstLoop fl=new firstLoop();
    System.out.println("eneter the value of n:");
     int num=sc.nextInt();
    System.out.println("the n natural numbers between given number is:");
    fl.nnaturalNumbers(num);
  }
}