/* write a java program to draw a pattern below using loops
*
* *
* * *
* * * *
* * * 
* * 
*
  */
import java.util.Scanner;
class semiDiamond{
  int rows,cols;
  int pattern(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=rows;cols++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for(rows=1;rows<=num;rows++){
      for(cols=num-1;cols>=rows;cols--){
        System.out.print("* ");
      }
      System.out.println();
    }
    return num;
  }
}
class pattern2{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    semiDiamond sd=new semiDiamond();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    sd.pattern(a);
  }
}