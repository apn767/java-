class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("if1 begin");
			if (true)
			{
				System.out.println("if2 body");
				if (true)
				{
					System.out.println("if3 body");
				}
				else
				{
					System.out.println("else3 body");
				}
				System.out.println("if2 body end");
			}
			else
			{
				System.out.println("else-2 body");
			}
			System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}
