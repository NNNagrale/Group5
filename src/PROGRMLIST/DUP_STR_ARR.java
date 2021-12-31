package PROGRMLIST;

public class DUP_STR_ARR 
{

	public static void main(String[] args)
	{
	  String s[]= {"aa","baa","aab","baa","aa","bab"};
	//	{"sonu","abhi","ajay",
//			      "sneh","snesha","sneh","sathi"};
	  int i,j,size=s.length;
		
		System.out.println("Dup is ");
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(s[i]==(s[j]) )
				{
					System.out.println(s[i]+"");
				}
				
			}
		}
	}
}
			
		
	  

	