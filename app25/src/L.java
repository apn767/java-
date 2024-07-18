class L 
{
	L()
	{
		this(585);
		System.out.println("L()");
	}
	L(int i)
	{
		this();
		System.out.println("L(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
