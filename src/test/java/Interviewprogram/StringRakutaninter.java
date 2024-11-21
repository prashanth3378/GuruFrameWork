package Interviewprogram;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class StringRakutaninter {
@Test
	public void sort()
	{
		String [] s= {"chennai","bangalore","mumbai"};
		
		TreeSet<String>set=new TreeSet<>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String sort:set)
		{
			System.out.println(sort);
		}
	}
}
