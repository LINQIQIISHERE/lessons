package test;

public class Test {
	public static int fib (int x)
	{
		if (x < 0)
		{
			System.out.println("Error: fib of negative numbers");
		}
		else if (x == 0 || x == 1)
		{
			return 1;
		}
		else
		{
			return (fib (x - 1) + fib (x - 2));
		}
		
		return 0;
		
	}
	public static void main (String args[])
	{
		/* calculating fib 10 */
		System.out.println("fib of 10 is " + fib (10));
	}

}
