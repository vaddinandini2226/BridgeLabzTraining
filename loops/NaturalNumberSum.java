package basicsPgms;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("sum: "+sum);
		sc.close();
	}

}
