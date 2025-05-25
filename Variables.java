import java.lang.*;

class Variables
{
	public static void main(String [] arg)
	{
	//byte a = 130; out of range
	int a = 130;
	System.out.println("Short dataType Max Value: " + Short.MAX_VALUE);
	a = 32768; 
	System.out.println(a);
	}
}