package practice;

public class reerse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="never ever give up";
			String[] st = s.split("");
			for(int i=0;i<st.length;i++)
		{
				String w = st[i];
				for(int j=w.length()-1;j>=0;j--)
				{
				System.out.println(w.charAt(j));
				}
				System.out.print(" ");
	}

}
}