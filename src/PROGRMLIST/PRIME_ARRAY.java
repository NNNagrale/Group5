package PROGRMLIST;

public class PRIME_ARRAY 
{
	public static void main(String[] args) 
	{
		
		int a[]= {1,2,55,97,7,0,39};
		int size=a.length;	                //{1,5,4,13,17,2,39,55,3,44,79};
		
		int flag,result;
		
		for(int i=0;i<size;i++)
		{
		   flag=0;            //if flag=0 then number is prime.
		        for(int j=2;j<a[i];j++)
		          {
		            result=a[i]%j;
		             if(result==0)
		             {
		                flag=1;  //if flag is 1 then number is not prime.
		            //    System.out.println(a[i]+ " not prime");
		             // break;
		             }
		          }
		  
		        if(flag==0)
		   System.out.println(a[i]+ " is prime");
		}

	}
}








