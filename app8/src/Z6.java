class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("main if1 begin");           
		    if (false)
				{
			         System.out.println("main if2 begin");
					 if (false)
					 {
						 System.out.println("main if3 begin");
						 System.out.println("main if3 end");
					 }
					 System.out.println("main if2 end");
		         }
				System.out.println("main if1 end");
		}
		System.out.println("main end");
	}
}
