// enter the shape and find out the area of that shape using methods
import java.util.*;
class Area
  {
  
    int radius,sid,len,wid,hig,brdh;
    Scanner sc=new Scanner(System.in);
  
  void square(){
    System.out.println("enter the side of square");
    sid=sc.nextInt();
   double area=sid*sid;
    System.out.println("Area is:" +area);
    
    }
    void rectangle(){
      System.out.println("enter the values of length and width");
      len=sc.nextInt();
      wid=sc.nextInt();
     double area=len*wid;
      System.out.println("Area is:" +area);
      }
    void triangle(){
      System.out.println("enter the values of length bredth and height");
      brdh=sc.nextInt();
      hig=sc.nextInt();
     double area=1.5*brdh*hig;
        System.out.println("Area is:" +area);
      }
    void circle(){
      System.out.println("enter the radius of circle");
      radius=sc.nextInt();
    double area=3.14*radius*radius;
      System.out.println("Area is:" +area);
  }
}
  class Areashapes
  {
      public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      Area a1=new Area();
      System.out.println("Enter the shape name");
     String sh=sc.next();
     switch(sh)
       {
       case "square":
         a1.square();
           break;
       case "rectangle":
         a1.rectangle();
           break;
       case "triangle":
         a1.triangle();
           break;
       case "circle":
         a1.circle();
           break;
         default:
        System.out.println("you have entered invalid");
    }
    }
  }