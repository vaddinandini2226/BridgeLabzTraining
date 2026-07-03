package collections;
/*
 * Program to find the maximum of three Integer numbers
 * using the Integer wrapper class and compareTo() method.
 * The program tests three cases where the maximum number
 * is in the 1st, 2nd, and 3rd positions.
 */
public class MaximumIntegerUC1 {
	static int MaxNumber(Integer n1,Integer n2,Integer n3)
	{
		int max=n1;
		if(n2.compareTo(max)>0)
		{
			max=n2;
		}
		if(n3.compareTo(max)>0)
		{
			max=n3;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Maximum number TC1  (80, 10, 50) : "+MaxNumber(80, 10, 50));
		System.out.println("Maximum number TC2  (10, 90, 50) : "+MaxNumber(10, 90, 50));
		System.out.println("Maximum number TC3  (500, 10, 700) : "+MaxNumber(500, 10, 700));
	}

}
