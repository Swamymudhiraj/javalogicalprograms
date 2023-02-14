/*write a java program to draw the pattern below
         *
       * *
     * * *
   * * * *
     * * *
       * *
         * 
  */
import java.util.Scanner;
class halfDiamond{
  int rows,cols,space;
  int pattern(int num){
    for(rows=1;rows<=num;rows++){
      for(space=num-1;space>=rows;space--){
        System.out.print(" ");
      }
      for(cols=1;cols<=rows;cols++){
        System.out.print("*");
      }
       System.out.println();
    }
        for(rows=1;rows<=num;rows++){
      for(space=1;space<=rows;space++){
        System.out.print(" ");
      }
          for(cols=num-1;cols>=rows;cols--){
            System.out.print("*");
          }
      System.out.println();
        }
    return num;
  }
}
class pattern12{
  public static void main(String args[]){
    int a;
    Scanner sc = new Scanner(System.in);
    halfDiamond hd=new halfDiamond();
    System.out.println("enter the value of a:");
    a=sc.nextInt();
    hd.pattern(a);
  }
}