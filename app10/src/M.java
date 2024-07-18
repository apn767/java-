class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if (false)
		{	
			i = i + 20;
			System.out.println("if block1: "+ i++);
			System.out.println("if block2: "+ i++);
			System.out.println("if block3: "+ i++);
		}	
		
		else
		{
			i = i + 30;
			System.out.println("else block statement1: "+ i++);
			System.out.println("else block statement2: "+ i++);
			System.out.println("else block statement3: " + i++);
			System.out.println(i);
		} 	
		System.out.println("main end:" + i);
	}
}
