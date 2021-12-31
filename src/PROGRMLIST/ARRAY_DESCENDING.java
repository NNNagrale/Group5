package PROGRMLIST;

public class ARRAY_DESCENDING {

	public static void main(String[] args) {		
		int a[]= {0,8,66,2,-4,1,44};
			
			   //{1,2,3,4,5};
		int i=0,j,size=a.length, temp;
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		
			}
		}
		for(i=0;i<size;i++)
		{
		System.out.println(a[i]+" ");
		}
	//	System.out.println(a[a.length-1]);

	}

}
