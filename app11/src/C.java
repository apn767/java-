class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if1 begin");
			if (true)
			{
				System.out.println("if2 body");
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
