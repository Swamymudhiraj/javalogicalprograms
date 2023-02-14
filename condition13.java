//Write a program that takes the day of the week and the current time as input and prints out whether or not the library is open using nested if statements.



import java.util.Scanner;
class condition13
  {
    public static void main(String args[])
    {
      String day; 
      int tym;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the time:");
      tym=sc.nextInt();
       System.out.println("enter the day:");
      day=sc.next();
    
       if(tym>=8 && tym<=12){
         if(day=="monday"){
          System.out.println("the library is opened ");
        }
          else if(day=="tuesday"){
          System.out.println(" the library is opened come and visit 8am to 12pm");
          }
          else if(day=="wednesday"){
          System.out.println("the library is opened come and visit 8am to 12pm");
          } 
            else if(day=="thursday"){
          System.out.println("the library is opened come and visit 8am to 12pm");
            } 
              else if(day=="friday"){
          System.out.println("the library is opened come and visit 8am to 12pm"); 
              } 
              else if(day=="saturday"){
             System.out.println("the library is opened come and visit 8am to 12pm"); 
          }
           else if(day=="sunday"){
          System.out.println("Thelibrary is closed on sunday please visit on monday to saturday on 8am to 12pm");
         } 
         else {
           System.out.println("You have entered invalid");
         } 
    }
  }
    
    
              
   
           
      
    
            
    
  
