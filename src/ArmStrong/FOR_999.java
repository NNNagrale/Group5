package ArmStrong;

public class FOR_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int  result,num;
		
		for(int i=0;i<999;i++)//3,4,5,....99%=0
		{
		   num=i;
		  result=0;
       while(num>0)
       {
    	  int x=num%10;//1
    	  
		  result=result+(x*x*x);//2;
		  
		  num/=10;//for separate digit 101,10,1
			
       }
       
		    if(result==i)
		{
		
		System.out.println("armstrong numbers are :"+i);
		   
		
		}

	}

}
}