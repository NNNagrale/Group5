package PROGRMLIST;

public class LCMHCF
{
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10,num2=35,lcm,hcf;
		
	    int	temp1=num1, temp2=num2,temp;
		while(temp2!=0)
	    {
	         temp=temp2;
	    	temp2=temp1%temp2;
	    	temp1=temp;
	    }
		
		hcf=temp1;
		lcm=(num1*num2)/hcf;
		System.out.println("lcm is "+lcm);
        System.out.println("hcf is "+hcf);
	}

}
