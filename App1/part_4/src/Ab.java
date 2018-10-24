class Ab
{
	public static void main(String[] args) 
	{
		System.out.println("from main..");
		int i=test1();
		int j=i+test1();
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
	public static int test1()
		{
			System.out.println("from test...");
			return 100;
		}
}
