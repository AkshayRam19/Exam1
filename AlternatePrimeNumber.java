public class AlternatePrimeNumber{
	public static void main(String[] args)
	{
		int count=0;
		int num=2;
		while(count<20)
		{if(isPrime(num))
			{
				if(count%2==0)
				{
					System.out.println(num+"");
				}
				count++;
			}
			num++;
		}
	}
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}}
