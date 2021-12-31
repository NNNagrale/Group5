package ArmStrong;

public class ARM_While4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=1634;
      int x,result=0;
       while(a>0)
       {
    	   x=a%10;
    	   a=a/10;
    	   result=result+(x*x*x*x);
       }

          System.out.println("armstrong :"+result);
	}

}
