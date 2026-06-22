package basicsPgms;

public class NameUsingCommandLine {
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Please enter a name: ");
		}
		else
		{
			System.out.println("Name: "+args[0]);
		}
	}
}
