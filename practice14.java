//Write a method called "printCurrentTime" that prints the current time (in hours, minutes, and seconds) to the console.
import java.util.Scanner;
class printCurrentTime{
     int hour,minut,seco;
     Scanner sc = new Scanner(System.in);
  void time(){
    System.out.println("Enter the hour:");
    hour=sc.nextInt();
    System.out.println("Enter the minutes:");
    minut=sc.nextInt();
    System.out.println("Enter the seconds:");
    seco=sc.nextInt();
    System.out.print(hour+ "hours:"+minut+ "minutes:"+seco+ "seconds");
  
  }
}
     class practice14{
       public static void main(String args[]){
         printCurrentTime pc=new printCurrentTime();
         pc.time();
       }
     }