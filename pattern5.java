/* draw a pattern below:
1 2 3 4 5 
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
import java.util.Scanner;
class PatternSq{
  int rows,cols;
  void Square(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=num;cols++){
        System.out.print(" "+cols);
      }
      System.out.println();
    }
    //return cols;
  }
}
class pattern5{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    PatternSq ps=new PatternSq();
    System.out.println("enter the value of num:");
    int num=sc.nextInt();
    ps.Square(num);
    //System.out.println(x);
  }
}