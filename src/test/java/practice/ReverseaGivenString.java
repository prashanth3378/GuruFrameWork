package practice;

import java.util.Scanner;

public class ReverseaGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string value");
String s = sc.nextLine();
String rev1="";
for(int i=s.length()-1;i>=0;i--)
{
	rev1=rev1+s.charAt(i);
}
System.out.println(""+rev1);
	}

}
