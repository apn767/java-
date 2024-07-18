class Z4
{
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;			
		final int j = 20;			
		switch (i)
		{
		case 5 :
			System.out.println("from case C1");
		    break;
		case 532 :
			System.out.println("from case C2");
		    break;
        case j :
			System.out.println("from case C3");
		    break;
		case 4 :
			System.out.println("from case C4");
		    break;
		}
		System.out.println("main end");
	}
}
