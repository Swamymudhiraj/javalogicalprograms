// enter the size of an array and elements of an array and display the array:
import java.util.Scanner;
class array5{
  public static void main(String args[]){
    int i,j,row,col;
      Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of row:");
    row=sc.nextInt();
     System.out.println("Enter the size of column:");
    col=sc.nextInt();
    int a[][]=new int[row][col];
    System.out.println("Enter the elements in array:");
    for(i=0;i<row;i++){
      for(j=0;j<col;j++){
       a[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<row;i++){
      for(j=0;j<col;j++){
        System.out.print(" "+a[i][j]);
      }
      System.out.println();
    }
  }
}