// write a java program to using nested for print the stars pattern
import java.util.Scanner;
class pattern{
  public static void main(String args[]){
    int i,j,num;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value:");
    num=sc.nextInt();
    for(i=1;i<num;i++)
      {
        for (j=1;j<=i;j++)
          {
            System.out.print("\t*");
          }
        System.out.println();
      }
  }
}