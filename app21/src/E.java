class E 
{
	static int i;
	static int j = D.i;//indirect read
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
