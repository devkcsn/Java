import java.lang.*;

class increament
{
	public static void main(String [] args)
	{ 
		int x = 5 , y, z;
		y=x++;
		System.out.println(x+ " " + y);
		x = 4 ;
		z = 2*x++ +3 * ++x;
		System.out.println(z);
	}
}
		