package GarbageCollection;

public class Cricketer {
	 Cricketer()
	 {
		 System.out.println("object is created");
	 }
	  public void finalize()
	 {
		 System.out.println("object is distroyed");
	 }
}
	  class CricketerDemo
	 {
	public static void main(String[] args) 
	{
	Cricketer c=new Cricketer();
	c=null;                     // by assigning null value
	Cricketer c1=new Cricketer();// by assigning one  refernce to another
	Cricketer c2=new Cricketer();
	c1=c2;
	new Cricketer();  // by anonymous object
	
System.gc();
	}

}
