package practice;

import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
		
		int num = sc.nextInt();  
		 //useing algorithm
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
	/*	StringBuffer sb=new StringBuffer(String.valueOf(num));
		 StringBuffer rev = sb.reverse();*/
		
	System.out.println("reverse number is " +rev);

}
}
