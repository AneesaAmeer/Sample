package Inheritance;

public class MultiLevelEx2 extends MultiLevelEx1 {
	public void display3()
	{
		System.out.println("Fruits");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelEx2 obj=new MultiLevelEx2();
		obj.display1();
		obj.display2();
		obj.display3();
	}

}
