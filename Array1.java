class Array1
{
	public static void main(String agrs[])
	{
		int a[]= new int[] {1,2,4,3};
		int max=a[0];
		for(int i=0;i<=a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		System.out.print(max);
	}
}