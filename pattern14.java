/* write a java program to print below pattern 
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/
import java.util.Scanner;
class pyramid{
  int rows,cols,space;
  void pattern(int num){
    for(rows=1;rows<=num;rows++){
      for(space=num-1;space>=rows;space--){
        System.out.print(" ");
      }
        for(cols=2;cols<=rows;cols++){
          System.out.print("*");
        }
      for(cols=1;cols<=rows;cols++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
class pattern14{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    pyramid p1=new pyramid();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    p1.pattern(a);
  }
}