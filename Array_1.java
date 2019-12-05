class Array_1 
{
	public static void main(String[] args)
	{
		int sum=0;
		int avg;
        	int[] a=new int[]{1,2,3,4,5};
        	for(int i=0;i<a.length;i++)
       	 	{
            		System.out.println(" "+a[i]);
			sum=sum+a[i];
		}
			avg=sum/a.length;
			System.out.println("sum is "+sum);
			System.out.println("average is "+avg);
	    
    		
	}
}