package PROGRMLIST;

import java.util.Arrays;

public class Arr_DUPLICATE
{
	public static void main(String[] args) 
	{
		int a[]= {3,4,8,6,3,1,4,8,9,1};	
		    //{76,45,2,5,2,76,7,2,76,56,54,2};
			//{55,66,55,3,2,1,3,1};
		int i,j,size=a.length;
		//System.out.println(Arrays.toString(a));
		System.out.println("Duplicate no are ");

		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]==(a[j]) )
				{
					System.out.print(a[i]+" ");
				}	
			} 
		}
	}
}


