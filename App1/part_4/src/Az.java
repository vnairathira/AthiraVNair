class Az
{
	static void test()
		{
		System.out.println(x);
		//int x=200;
		 Az.x=200;
		}
		static int x=10;

	public static void main(String[] args) 
	{
		System.out.println(x);
		test();
		System.out.println(x);
	}
}
