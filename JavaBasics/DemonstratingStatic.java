package basicsPgms;

public class DemonstratingStatic {
	static int a;
	static
	{
		a=200;
		System.out.println("Static Block");
	}
	static void display()
	{	System.out.println("Static variable:"+a);
		System.out.println("Static method ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemonstratingStatic.display();
	}

}
