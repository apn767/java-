class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if1 begin");
			if (false)
			{
				System.out.println("if2 body");
				if (false)
				{
					System.out.println("if3 body");
				}
				else
				{
					System.out.println("else3 body");
				}
				System.out.println("if2 end");
			}
			else
			{
				System.out.println("else-2 body");
			}
			System.out.println("if1 end");
		}
		else
		{
				System.out.println("else1 body");
		}		
		System.out.println("main end");
	}
}
