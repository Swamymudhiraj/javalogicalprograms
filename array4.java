// write a java program to print a matrix using arrays.
import java.util.Scanner;
class array4
{
public static void main(String args[])
{
     int i,j;
  Scanner sc = new Scanner(System.in);
     int a[][]=new int[3][3];
    System.out.println("enter the input values");
  for(i=0;i<3;i++){
    for(j=0;j<3;j++){
      a[i][j]=sc.nextInt();
    }
  }
  System.out.println("the elements of matrix is:");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
}
}