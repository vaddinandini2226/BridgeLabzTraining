package basicsPgms;

import java.util.Scanner;

public class PlaceValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("One");
		}
		else if(n==10)
		{
			System.out.println("Ten");
		}
		else if(n==100)
		{
			System.out.println("Hundred");
		}
		else
		{
			System.out.println("Thousand");
		}
		sc.close();
	}

}
