class Y 
{
	public static void test1()
	{
		System.out.println("from test1..");
		System.out.println("from test1..");
		System.out.println("from test1..");
		System.out.println("from test1..");
		System.out.println("from test1..");
	}
	public static void main(String[] args) 
	{	
		//return; it will give error... return ,continue , break should be last...
		test2();
		System.out.println("Hello World!");
		test1();
		System.out.println("end of main...");
		return;
		// return 100; will be error...
	}
	
	 static void test2()
	{
		System.out.println("from test2..");
		return; // without any value we can keep return in void...if we pass any value it will be error...
	}
}
