class Aw
{
	static int x=10;
	static void test()
		{
		int x=20;
		System.out.println(x);
		}

	public static void main(String[] args) 
	{
		System.out.println("main"+x);
		test();
		System.out.println("main end"+x); // static members execute from topto bottom
		//System.out.println("main"+x);
	}
}
