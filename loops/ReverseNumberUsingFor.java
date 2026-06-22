package basicsPgms;

import java.util.Scanner;

public class ReverseNumberUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		for(;n>0;)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("Reverse of number is: "+rev);
		sc.close();
	}

}
