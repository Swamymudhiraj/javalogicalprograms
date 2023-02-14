// given alphabet is ovel or consonent 
//       using switch case

import java.util.Scanner;
class switchcase3
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the alphabet:");
      ch=sc.next().charAt(0);
     switch(ch){
       case 'a': case 'A':
       case 'e': case 'E':
       case 'i': case 'I':
       case 'o': case 'O':
       case 'u': case 'U':
         System.out.println("its a ovel");
         break;
       default:
         System.out.println("its a consonent");
     }
     }
  }
    
  
      
      
  
  