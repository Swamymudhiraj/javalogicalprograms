/* write a java program to print below pattern.
* * * * *
*       *
*       *
*       *
* * * * * 
  */
import java.util.Scanner;
class pattern{
  int rows,cols,num;
  void holoSquare(int num){
    for(rows=1;rows<=num;rows++){
      if(rows==5 || rows==1)
        for(cols=1;cols<=num;cols++){
          System.out.print(" *");
        }
      else 
        for(cols=1;cols<=num;cols++)
        if(cols==1||cols==5){
          System.out.print(" * "+"  ");
        }
      else{
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
class pattern18{
  public static void main(String args[]){
    pattern pn=new pattern();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n:");
    int num =sc.nextInt();
    pn.holoSquare(num);
  }
}