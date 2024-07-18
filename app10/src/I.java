class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{	
			System.out.println("if block1");
			System.out.println("if block2");
			System.out.println("if block3");
		}	
		
		else
		{
			int i = 110;
			System.out.println("else block statement1: "+ i++);
			System.out.println("else block statement2: "+ i++);
			System.out.println("else block statement3: " + i++);
			System.out.println(i);
		} 	
		System.out.println("main end");
	}
}
