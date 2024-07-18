class I 
{
	I(int I)
	{
		System.out.println("I(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj = new I(90);
		System.out.println("main end");
	}
}
