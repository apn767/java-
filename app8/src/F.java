class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)
		{
			System.out.println("main if1 begin");
			System.out.println("main if1 end");           
		        if (true)
					{
			         System.out.println("main if2 begin");
		             System.out.println("main if2 end");
					 if (false)
					 {
						 System.out.println("main if3 begin");
						 System.out.println("main if3 end");
					 }
		            }
		}
		System.out.println("main end");
	}
}
