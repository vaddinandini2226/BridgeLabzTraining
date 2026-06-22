package basicsPgms;
class Default
{
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bool;
	void display()
	{
		System.out.println("--Primitive datatypes default value--");
		System.out.println("Byte default value: "+b);
		System.out.println("Short default value: "+s);
		System.out.println("int default value: "+i);
		System.out.println("long default value: "+l);
		System.out.println("float default value: "+f);
		System.out.println("double default value: "+d);
		System.out.println("char default value: "+c);
		System.out.println("boolean default value: "+bool);
		
	}
	
}
public class DefaultValuesOfPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default d=new Default();
		d.display();
	}

}
