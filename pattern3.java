/* draw star pattern of square

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/
import java.util.Scanner;
class pattern{
  int rows,cols,num;
  void square(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=num;cols++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
class pattern3{
  public static void main(String args[]){
    pattern pn=new pattern();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n:");
    int num =sc.nextInt();
    pn.square(num);
  }
}