// write a java program to enter given month find season 
//       using switch case

import java.util.Scanner;
class switchcase4
  {
    public static void main(String args[])
    {
      int mont;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the month value:");
      mont=sc.nextInt();
     switch(mont){
       case 3:case 5:
       case 4:case 6:
         System.out.println("its summer season");
         break;
       case 7:case 9:
       case 8:case 10:
        System.out.println("its rainy season");
         break;
       case 11:case 1:
       case 12:case 2:
         System.out.println("its winter season");
         break;
       default:
         System.out.println("you entered invalid");
     }
     }
  }
    
  
      
      
  
  