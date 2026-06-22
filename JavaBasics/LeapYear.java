package basicsPgms;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year greater than 1581 : ");
		int year=sc.nextInt();
		if(year>1581)
		{
			if((year%4==0 && year%100!=0)||year%400==0)
			{
				System.out.println("Leap year ");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		}
		else
		{
			System.out.println("Invalid year...");
		}
		sc.close();
	}
}
