class T
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
		case 3 :			
		case 5 :			
		case 7 :			
		case 9 :			
			System.out.println("odd value");
			break;

		case 2 :  
		case 4 :  
		case 6 :  
		case 8 :  
		case 10 :  
			System.out.println("even value");
		    break;
		default:
			System.out.println("supply only one number b/w 1 to 10");

		}
		System.out.println("main end");
	}
}
