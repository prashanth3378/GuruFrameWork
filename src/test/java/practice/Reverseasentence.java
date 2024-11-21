package practice;

import java.util.Scanner;

public class Reverseasentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the sentence");
String s = sc.nextLine();
String rev=" ";
String[] str = s.split(" ");
for(int i=str.length-1;i>=0;i--)
{
 System.out.print(str[i]+" ");	
}
}

}
