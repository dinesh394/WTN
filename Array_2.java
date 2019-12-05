class Array_2
{
	public static void main(String[] args)
	{
		int max=0;
        	int[] a=new int[]{1,2,3,4,5};
        	for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			  max=a[i];

		}
		System.out.println("maximum number is "+max);
		int min=a[0];
        	for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			  min=a[i];

		}
		System.out.println("minimum number is "+min);
	}
}
