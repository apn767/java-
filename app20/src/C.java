class C 
{
	static int i = 10;
	static int j = 20;
	static int k;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		i = 100;
		j = 300;
		k = 500;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
