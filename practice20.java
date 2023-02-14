// saparate the elements from array print negative first and then positive elements from given array arr{9,3,-8,5,-4,2,-1,7}
import java.util.Scanner;
class practice20{
  public static void main(String args[]){
    int i,n;
    int[] arr={-1,5,7,-3,8,-9,10,-11};
    for(i=0;i<arr.length;i++){
      if(arr[i]<=0){
        System.out.print(" "+arr[i]);
      }
    }
    for(i=0;i<arr.length;i++){
      if(arr[i]>=0){
        System.out.print(" "+arr[i]);
      }
    }
  }
}