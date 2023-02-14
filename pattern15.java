/* write a java program to print a given pattern below

* * * * * * * * *
  * * * * * * *  
    * * * * *    
      * * *       
        *        
*/
import java.util.Scanner;
class lowerPyramid{
  int rows,cols,space;
  void pattern(int num){
    for(rows=1;rows<=num;rows++){
      for(space=2;space<=rows;space++){
        System.out.print(" ");
      }
      for(cols=num;cols>=rows;cols--){
        System.out.print("*");
      }
      for(cols=num-1;cols>=rows;cols--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
class pattern15{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    lowerPyramid lp=new lowerPyramid();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    lp.pattern(a);
  }
}