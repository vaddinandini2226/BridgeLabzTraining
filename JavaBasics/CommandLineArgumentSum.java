package basicsPgms;

public class CommandLineArgumentSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int invalidnums=0;
		for(String arg:args)
		{
			try
			{
				int num=Integer.parseInt(arg);
				sum=sum+num;
			}
			catch(NumberFormatException e)		
			{
				invalidnums++;
			}
		}
		System.out.println("Valid integer sum: "+sum);
		System.out.println("Invalid Integers count: "+invalidnums);
	}

}
