class Aa
{
	public static void main(String[] args) 
	{
		System.out.println("from main..");
		int i=test1();
		System.out.println("i="+i);
		//System.out.println(test1());
	}
	public static int test1()
		{
			System.out.println("from test...");
			return 100;
		}
}
