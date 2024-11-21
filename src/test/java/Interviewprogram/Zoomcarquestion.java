package Interviewprogram;

import org.testng.annotations.Test;

public class Zoomcarquestion {
@Test
	public void zoom()
	{
	String s = "ab$b%f&";
	char[] a = s.toCharArray();
	String s1 = "";
	String rev = "";
	int count = 0;
	String st = "";
	for (char ch : a) {
		if (ch >= 'a' && ch <= 'z') {
			rev = rev+ ch;     //abbf
		}
	}

	for (int i = 0; i < a.length; i++) {
		if (a[i] >= 'a' && a[i] <= 'z')
		{
			System.out.print(rev.charAt(count));     // abbf  
			count++;
		} else
		{
			System.out.print(s.charAt(i));
		}
	}
}}