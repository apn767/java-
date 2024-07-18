class F
{
	enum Test {Hello,Hi,Java,BTM,Alok};
	public static void main(String[] args) 
	{
		System.out.println(Test.Hello.ordinal());
		System.out.println(Test.Hi.ordinal());
		System.out.println(Test.Java.ordinal());
		System.out.println(Test.BTM.ordinal());
		System.out.println(Test.Alok.ordinal());
		System.out.println("int min: " + Integer.MIN_VALUE);
		System.out.println("int max :" + Integer.MAX_VALUE);
	}
} 
