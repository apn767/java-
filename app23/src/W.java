class W 
{
	int i;
	void test()
	{
		System.out.println("test:" + this.i);
		this.i = 20;
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		w1.i = 10;
		System.out.println("main1: " + w1.i);
		w1.test();
		System.out.println("main2: " + w1.i);
	}
}
