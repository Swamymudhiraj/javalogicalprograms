/* draw the pattern below using methods
A
A B
A B C
A B C D
A B C D E
  */
import java.util.Scanner;
class patternChar{
  int rows,cols,count=1,a;
  void Triangle(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=1;cols<=rows;cols++){
        System.out.print((char)(cols+64)+" ");
      }
      System.out.println();
    }
  }
}
class pattern8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    patternChar pc = new patternChar();
    System.out.println("enter the number:");
    int num=sc.nextInt();
    pc.Triangle(num);
  }
}