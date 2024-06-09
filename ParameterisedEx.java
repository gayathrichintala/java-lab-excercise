
package constructs;

public class ParameterisedEx {

	
		    static int LargeNum(int a, int b, int c)
		    {
		        if(a > b && a > c)
		        {
		            return c;
		        }
		        else if(b > c){
		            return b;
		        }
		        else
		        {
		            return c;
		        }
		    }
		    public static void main(String[] args)
		    {
		        System.out.println(LargeNum(10,5,20));
		    }
		
		    {

	}
}
