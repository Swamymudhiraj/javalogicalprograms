// Write a program to calculate the area and volume of a sphere using methods

import java.util.Scanner;
class Volumeradius{
  int radius;
  double pi=3.14;
  double vol,area;
  Scanner sc=new Scanner(System.in);
  void Volume(){
    System.out.println("enter the radius of sphere:");
    radius=sc.nextInt();
    vol=(4.0/3)*pi*radius*radius*radius;
    System.out.println("the volume of sphere is:"+vol);
  }
   void Area(){
    System.out.println("enter the radius of sphere:");
    radius=sc.nextInt();
    area=4*pi*radius*radius;
    System.out.println("the area of sphere is:"+area);
    //return area;
  }
}
class Sphere{
  public static void main(String args[]){
    Volumeradius vr=new Volumeradius();
    vr.Volume();
    vr.Area();

  }
}
