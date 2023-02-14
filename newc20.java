//Finding the second most frequent element in an array:int numbers[] = {1, 2, 4, 4, 5, 6, 6, 7, 2};
import java.util.*;
class newc20{
   public static void main(String[] args) {
      int[] arr= {1,2,4,4,5,6,6,7,2};
        int maxcount = 0;
         int n=arr.length;
        int elemax_freq = 0;
        int sec_freq=0;
    for (int i=0; i<n; i++)
    { 
        int count = 0;
       for (int j=0; j<n; j++)
       { 
         if (arr[i]==arr[j]){
             count++;
            } 
       } 
         if(count>maxcount)
      { 
          maxcount=count;
          elemax_freq=arr[i];
          sec_freq=arr[i+1];
      }  
  }  
      System.out.println("the first most frequent element is:"+elemax_freq);
      System.out.println("the second most frequent element is:"+sec_freq);
}
}