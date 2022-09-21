package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input number to find prime numbers up to and including any real number");
		int n = in.nextInt();
		
		int[] prime = new int [n+1];
			for (int i = 2 ; i <= n ; i++)
			{
				prime [i] = i;
			}
			for (int i = 2 ; i <= n ; i++)
			{
				if (prime [i] != 1)
				{
					for (int j = i ; j <= n ; j = j + i)
					{
						prime [j] = 1;
					}
				}
			}
			for (int i = 2 ; i <= n ; i++)
			{
				if (prime [i] != 1)
				{
					System.out.println(i);
				}
			}
	}
}
