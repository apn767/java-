class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10; i++ )
		{
			System.out.println("loop begin:" + i);
			if (i == 4)
			{			
				System.out.println("if begin");
				break;
			}
			System.out.println("loop end:" + i);
		}
		System.out.println("main end");
	}
}
