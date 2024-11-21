package Interviewprogram;

import java.util.LinkedHashSet;

import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.Test;


public class Zoominterview {
	@Test(priority = -1)
	public void pro()
	{
		
String s="aabbcda"; // op a2b2c1d1a1
for(int i=0;i<s.length();i++)
{
	int count=1;
	char ch = s.charAt(i);
for(int j = i+1;j<s.length();j++)
	{
		if(ch==s.charAt(j))
		{
			count++;
			i++;
		}
		else {
break;
		}}
System.out.print(ch+""+count);
}}
	@Test(enabled = false)
	public void occurance()
	{
		String s="aabbccad"; // a3b2c2d1
		LinkedHashSet<Character>set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch1:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch1==s.charAt(i))
				{
					count++;
				}
				}
			System.out.print(ch1+""+count);
		}
	}
	}
			

	
