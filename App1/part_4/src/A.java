class A 
{
	public static void main(String[] args) 
	{
		System.out.println("MAIN BEGIN..");
		test1();
		System.out.println("MAIN BEGIN..");
		System.out.println(test1());
	}
	public static int test1()
		{
			System.out.println("from test...");
			return 100;
		}
}
