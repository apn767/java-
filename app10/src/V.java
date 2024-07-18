class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		{
			System.out.println("block1 statement1: ");
			System.out.println("block1 statement2: ");
			System.out.println("block1 statement3: ");
		}

		System.out.println("something");

		{
			System.out.println("block2 statement1: ");
			System.out.println("block2 statement2: ");
			System.out.println("block2 statement3: ");
		}

		System.out.println("main end:");
	}
}	