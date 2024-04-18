package Inheritance;

public class HierarchialEx1 extends  HierarchialEx {
public void display1()
{
	System.out.println("B");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialEx1 obj=new HierarchialEx1();
		obj.display();
		obj.display1();
	}

}
