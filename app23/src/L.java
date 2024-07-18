class L 
{
	int x;
	static
	{
		L ref = new L();
		System.out.println(ref.x);
	}
}
