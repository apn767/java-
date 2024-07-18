class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin from X");
		W.main(args);
		System.out.println("main end from X");
	}
	static
	{
		System.out.println("SIB from X");
	}
}
