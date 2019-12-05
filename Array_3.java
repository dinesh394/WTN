import java.util.*;
class Array_3
{
	public static void main(String[] args)
	{
		int c=0;
		Scanner sc=new Scanner(System.in);
        	int[] a=new int[]{1,2,3,4,5};
		System.out.println("enter the value to search");
		int x=sc.nextInt();
        	for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			 c=1;
			
		}
		if(c==1)
		System.out.println("element  found");
		else
		System.out.println("element not found");
	}
}
