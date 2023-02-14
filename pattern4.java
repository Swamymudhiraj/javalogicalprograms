/*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/
import java.util.Scanner;
class Pattern{
  int rows,cols,num;
  void square(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=num;cols++){
        System.out.print(" "+rows);
      }
      System.out.println();
    }
  }
}
class pattern4{
  public static void main(String args[]){
    Pattern pn=new Pattern();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n:");
    int num =sc.nextInt();
    pn.square(num);
  }
}