package ArmStrong;
//import java.lang.FdLibm.Pow;

public class ARMSTRONG_FOR {

	public static void main(String[] args) 
	{
		
		int num=153;
		
		int result=0 ,temp, reminder;
        for(temp=num;num>0;num=num/10)
		{
			
			
			reminder=num%10;//3,5,1
			result=result+(reminder*reminder*reminder);
		}
		    if(temp==result)
		{
		
		System.out.println(result+ "is Armstrng number ");
		}
		    else
		    {
		    	System.out.println(temp+" is not Armstrng number :");
		    }
	
	}
}

	







/* for(x=temp % 10,temp = temp/10 & if(temp==0) break;*/
