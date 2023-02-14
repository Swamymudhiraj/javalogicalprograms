/* write a java program to print the below pattern.
         *
       * * * 
     * * * * * 
  */
import java.util.Scanner;
class diamond{
  int rows,cols,space;
  void pattern(int num){
    for(rows=1;rows<=num;rows++){
      for(cols=num;cols>=1;cols--){
        if(cols>rows){
          System.out.print(" ");
        }
        else{
          System.out.print(" *");
        }
      }
      System.out.println();
    }
  }
}
class pattern13{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    diamond d1=new diamond();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    d1.pattern(a);
  }
}