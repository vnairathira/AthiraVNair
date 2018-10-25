class Ag
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		//test();
		test(10);
	}
	public static void test(int i)
	{
		System.out.println("from test.."+i); // void method cannot call inside SOP
	}
}
