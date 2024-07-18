class Z6 
{
	public static void main(String[] args) 
	{
		boolean b1 = true, b2 = false;
		System.out.println((b1 = !b1) || b2);//false
		System.out.println("@1:" +b1 + "," + b2);//
		System.out.println((b1 = !b2) || b2);//
		System.out.println("@2:" +b1+ "," +b2);//

		System.out.println((b1 = !b1) && b2);//
	    System.out.println("@3:" +b1 + "," + b2);//
	    System.out.println((b1 = !b2) && b2);//
		System.out.println("@4:" +b1 + "," + b2);//

		System.out.println((b1 = !b1) || (b2 = b1));//
		System.out.println("@5:" +b1 + "," + b2);//
        System.out.println((b1 = !b2) || (b2 = b1));//
		System.out.println("@6:" +b1 + "," + b2);//

        System.out.println((b1 = !b1) && (b2 = b1));//
		System.out.println("@7:" +b1 + "," + b2);//
		System.out.println((b1 = !b2) && (b2 = b1));//
		System.out.println("@8:" +b1 + "," + b2);//

        System.out.println((b1 = !b1) && (b2 = !b1));//
		System.out.println("@9:" +b1 + "," + b2);//
		System.out.println((b1 = !b2) && (b2 = !b1));//
		System.out.println("@10:" +b1 + "," + b2);//
		
		System.out.println((b1 = !b1) || (b2 = !b1));//
		System.out.println("@11:" +b1 + "," + b2);//
        System.out.println((b1 = !b2) || (b2 = !b1));//
		System.out.println("@12:" +b1 + "," + b2);//


	}
}
