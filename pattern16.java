/*
        *
      * * * 
    * * * * * 
  * * * * * * *     
* * * * * * * * *
  * * * * * * *  
    * * * * *    
      * * *       
        *        
*/
import java.util.Scanner;
class diamond{
  int rows,cols,space;
  void pattern(int num){
    for(rows=1;rows<=num-1;rows++){
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
class pattern16{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    diamond d1=new diamond();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    d1.pattern(a);
  }
}