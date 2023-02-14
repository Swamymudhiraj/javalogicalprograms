/* print the given pattern below
1
2 3
4 5 6
7 8 9 10
11 12 13 14
*/
import java.util.Scanner;
class patternTriangle{
  int rows,cols,count=1;
  void Triangle(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=rows;cols++){
        System.out.print(" "+count++);
      }
      System.out.println();
    }
  }
}
class pattern6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    patternTriangle pt = new patternTriangle();
    System.out.println("enter the number:");
    int num=sc.nextInt();
    pt.Triangle(num);
  }
}
