/* 
   * * * 
 *       *
 *      
   * * *  
         *
 *       *
   * * *
*/
import java.util.Scanner;
class patternS{
  int rows,cols,num;
  void sPattern(int num){
for(rows=1;rows<=7;rows++){
  for(cols=1;cols<=6;cols++){
    if(rows==1||rows==4||rows==7)
      if(cols==2||cols==3||cols==4)
    System.out.print(" "+"*");
  } 
  for(cols=1;cols<=6;cols++){
    if(rows==2||rows==3||rows==6)
      if(cols==1)
    System.out.print("*");
  } 
    for(cols=1;cols<6;cols++){
    if(rows==2||rows==6)
      if(cols==5)
    System.out.print(" * ");
      else
        System.out.print(" ");
      if(rows==5)
        if(cols==5)
        System.out.print(" "+" * ");
      else                
          System.out.print(" ");
    }
  
        System.out.println();
}
}
}
class pattern19{
  public static void main(String args[]){
    patternS ps=new patternS();
    Scanner sc= new Scanner(System.in);
    ps.sPattern(8);
  }
}