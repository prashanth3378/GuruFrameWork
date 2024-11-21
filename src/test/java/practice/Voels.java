package practice;

public class Voels {

	public static void main(String[] args) {
		String s = "testyanytra";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		
		//	char ch=s.charAt(i);
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u')
			{
				 count ++;
				 System.out.println(ch[i] );
			}
		}
				System.out.println("no of vowels is" + count  );
				
						

			}
				
			
		}


