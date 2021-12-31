package PROGRMLIST;

public class REVPOSITION 
{
public static void main(String a[])
	{
		String s="Snehal kolhe";
		int t=0,last=s.length();
		int j=last-1;
		char [] st=s.toCharArray();
		while(t<j)
		{
			if(st[t]== ' ')
			{
				t++;
				continue;
			}
			else
				if(st[j]== ' ')
				{
					j--;
					continue;
				}
			else
		{	
				char temp=st[t];
				st[t]=st[j];
				st[j]=temp;
				t++;
				j--;
		}
		}
		System.out.println(st);
		
		
	}

}
