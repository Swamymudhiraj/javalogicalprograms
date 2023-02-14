/*print the below pattern using methods and nested loops:

           *
         * *
       * * *
     * * * *
   * * * * * 

 */
import java.util.Scanner;
class pattern{
  int rows,cols,num,space;
  void square(int num){
    for(rows=1;rows<=num;rows++){
      for(space=num-1;space>=rows;space--){
        System.out.print(" ");
      }
      for(cols=1;cols<=rows;cols++){
        System.out.print("*");
      }
      System.out.println();
    
   }
  }
}
class pattern11{
  public static void main(String args[]){
    pattern pn=new pattern();
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value of n:");
    int num =sc.nextInt();
    pn.square(num);
  }
}