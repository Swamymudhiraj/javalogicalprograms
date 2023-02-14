// Write a JAVAprogram to find total number of alphabets, digits or special character in a string.
 import java.util.Scanner;
  public class findcharecter{
	  public static void main(String[] args){
		String str;
		int i, alph=0, digi=0, spl=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the string:");
		str = sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch >='A' && ch<='Z') {
				alph++;
			}
			else if(ch>='0' && ch<='9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("Number of Alphabet Characters:"+ alph);
		System.out.println("Number of Digit Characters:"+digi);
		System.out.println("Number of Special Characters:"+spl);
	}
}
