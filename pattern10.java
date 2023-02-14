/* write a java program to print the pattern below.

* * * * *
* * * *
* * *
* *
*
*/
import java.util.Scanner;
class pattern{
  int rows,cols,num,space;
  void square(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=num;cols>=rows;cols--){
        System.out.print("* ");
      }
      for(space=1;space<=rows;space++){
        System.out.print(" ");
      }
      System.out.println();
    
   }
  }
}
class pattern10{
  public static void main(String args[]){
    pattern pn=new pattern();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n:");
    int num =sc.nextInt();
    pn.square(num);
  }
}