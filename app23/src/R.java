class R 
{
	int i;
	public static void main(String[] args) 
	{
		R ref1 = new R();
		ref1.i = 10;
		R ref2 = new R();
		ref2.i = 20;
		R ref3 = new R();
		ref3.i = 30;
	
		System.out.println(ref1.i);
		System.out.println(ref2.i);
		System.out.println(ref3.i);
		ref2.i = ref1.i + ref3.i;
		System.out.println(ref1.i);
		System.out.println(ref2.i);
		System.out.println(ref3.i);
		
	}
}
