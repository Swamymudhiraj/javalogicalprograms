/*
Draw a patttern using nested for loops
*
* *
* * *
* * * *
* * * * *
*/
import java.util.Scanner;
class rightAngle{
  int rows,cols;
  int pattern(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=rows;cols++){
        System.out.print("* ");
      }
      System.out.println();
    }
    return num;
  }
}
class pattern1{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    rightAngle ra=new rightAngle();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    ra.pattern(a);
  }
}