package AcccessModifier;

public class SampleAccess {
	public void display()
	{
		System.out.println("Its a public modifier");	
	}
	protected void display1()
	{
		System.out.println("Its a protector modifier");
	}
	private void display2()
	{
		System.out.println("Its a private modifier");
	}
	void add()
	{
		System.out.println("Its a default modifier");
	}
	public static void main(String args[])
	{
		SampleAccess obj=new SampleAccess();
	obj.display();
	obj.display1();
	obj.display2();
	obj.add();
	}
}
	
	




