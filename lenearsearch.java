//write a java program of linear search of element:
import java.util.Scanner;
class lenearsearch {
  public static void main(String []args){
    int i,n=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size:");
    n = sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter the elements in an array:");
    for(i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the search element:");
    int elem = sc.nextInt();
    for(i=0;i<arr.length;i++){
    if(arr[i]==elem){
   System.out.println("The element is found in"+i+"position");
    }
    }
  }
}