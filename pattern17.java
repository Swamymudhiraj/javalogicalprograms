/* write a java program to print pattern given below.
* 
* *
*   *
*     *
* * * * *
*/
public class pattern17{
   public static void main(String[] args){
      int   rows, cols;
      for( rows=1;rows<=5;rows++){    
        if(rows==5){
         for( cols=1;cols<=rows;cols++){   
            System.out.print("*");
         } 
        }
        else {
             for( cols=1;cols<=rows;cols++){
                if(cols==1 || cols==rows)
                   System.out.print("*");
                else
                   System.out.print(" ");
            }
         }
      System.out.println();
      }
   }
}