package Interviewprogram;

import org.testng.annotations.Test;

public class reversealphabutnotspec {
@Test
	public void reverse()
	{
		String s="prashi@#$%";
		String alpha ="";
		String spec="";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				alpha=alpha+s.charAt(i);
			}
			else {
				spec=spec+s.charAt(i);
			}}
		for(int j=alpha.length()-1;j>=0;j--)
		{
			rev=rev+s.charAt(j);
		}
		System.out.print(rev+""+spec);
	}}