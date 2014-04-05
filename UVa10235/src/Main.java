import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt())
		{
			int N = sc.nextInt();

			Boolean isPrime = CheckPrime(N);

			// reverse number N
			String str_N = String.valueOf(N);
			StringBuilder sb = new StringBuilder(str_N);
			sb.reverse();
			int rN = Integer.parseInt(sb.toString());

			Boolean isRevPrime = CheckPrime(rN);

			if (isPrime == false)
			{
				System.out.print(N);
				System.out.println(" is not prime.");
			}
			else if (isPrime == true && isRevPrime == false)
			{
				System.out.print(N);
				System.out.println(" is prime.");
			}
			else if (isPrime == true && isRevPrime == true)
			{
				if (N != rN)
				{
					System.out.print(N);
					System.out.println(" is emirp.");
				}
				else
				{
					System.out.print(N);
					System.out.println(" is prime.");
				}
			}
		}
		sc.close();
	}
	
	static Boolean CheckPrime(int input)
	{
		if(input == 1)
			return false;
		
		Boolean isPrime = true;
		for (int i = 2; i * i <= input; i++)
		{
			if (input % i == 0)
			{
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
