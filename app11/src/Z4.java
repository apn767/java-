class Z4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (true)	
			if (false)
			    if (true)		
					System.out.println("if3 body");			
				else			
					System.out.println("else3 body");				
			else	
				System.out.println("else-2 body");
		else
				System.out.println("else1 body");		
		System.out.println("main end");
	}
}
