package practice;

import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.Test;

public class javaprograms {
@Test
	public void pro()
	{
		String s="prashanthvmallapur";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
@Test
public void pro1()
{
	String s="never ever give up";
	String[] st = s.split("");
	for(int i=st.length-1;i>=0;i--)
	{
		System.out.print(st[i]);
	}
}
@Test(priority = -1)
public void proreverse() {
	String s="never ever give up";
	String[] st = s.split(" ");
	for(int i=0;i<st.length;i++)
{
		String s1 = st[i];
		for(int j=s1.length()-1;j>=0;j--)
		{
			System.out.print(s1.charAt(j));
		}
		System.out.print(" ");
}}
@Test(priority = 0)
public void primeno()
{
	int no=3;
	int count=0;
	for(int i=1;i<=no;i++)
	{
		if(i%no==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("prime");
	}
	else {
		System.out.println("not a prime");
	}
}

}
