/* draw the patter below using methods and nested loops
A
B B
C C C
D D D D
E E E E E
  */
import java.util.Scanner;
class patternChar{
  int rows,cols,count=1,a;
  void Triangle(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=rows;cols++){
        System.out.print((char)(rows+64)+" ");
      }
      System.out.println();
    }
  }
}
class pattern7{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    patternChar pc = new patternChar();
    System.out.println("enter the number:");
    int num=sc.nextInt();
    pc.Triangle(num);
  }
}