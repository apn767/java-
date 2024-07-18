class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (args.length < 1)
		{
			System.out.println("supply onr command line argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch (5)
		{
		case 1 :			
			System.out.println("from case 1");
			System.out.println("from case 1");
			System.out.println("from case 1");
			System.out.println("from case 1");
			break;

		case 5 :  
			System.out.println("from case 5");
			System.out.println("from case 5");
			break;

		default:
			System.out.println("from default");
			System.out.println("from default");
			System.out.println("from default");
			break;
		
		case 10 :  
			System.out.println("from case 10");
			System.out.println("from case 10");

		}
		System.out.println("main end");
	}
}
