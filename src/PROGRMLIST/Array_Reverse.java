package PROGRMLIST;

public class Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			int a[]= {1,2,3,4,5,6};
			
			int temp,size=a.length, last=size-1;
			
			for(int i=0;i<last/2; i++)
			{
				temp=a[i];
				a[i]=a[last];
				a[last]=temp;
				last--;
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			//int length=6;
			
			//for(int i=length;i>=0;i--)
			//{
				//System.out.println(a[i]);
			//}

	}
}

//int b[]=new int[a.length];
//int j=0;
//for(int i=(a.length-1),i>=0;i--)
//{
//b[j]=a[i];
//j++;
//}

