class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("main if1 begin");
			System.out.println("main if1 end");           
		        if (false)
					{
			         System.out.println("main if2 begin");
		             System.out.println("main if2 end");
		            }
		}
		System.out.println("main end");
	}
}
