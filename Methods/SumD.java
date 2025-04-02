class SumD{
	public static int sumdigit(int n)
	{
		if(n>=1)
		{
			int res=n%10;
			return (res+sumdigit(n/10));
		}
		return 0;
	}
	public static void main(String[] args)
	{
		System.out.println(sumdigit(53281));
	}
}