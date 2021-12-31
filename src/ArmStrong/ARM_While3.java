package ArmStrong;

public class ARM_While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=370;
		int x, temp=a,result=0;
		while(a!=0)
		{
			
			x=a%10;
			a=a/10;
			result=result+(x*x*x);//1,7,3
		
		}
		if(result==temp)
		{
			System.out.println(result+" is armstrong No...");
		}
		else
		{
			System.out.println(result+"is not armstrong number ");
		}
		}


}