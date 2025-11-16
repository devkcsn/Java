import java.lang.*;
import java.util.Scanner;

class studentChallenge2
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		float a,b,c,area,s;
		System.out.print("Enter first side of triangle: ");
		a = sc.nextFloat();
		System.out.print("Enter second side of triangle: ");
		b = sc.nextFloat();
		System.out.print("Enter third side of triangle: ");
		c = sc.nextFloat();
		s = (a+b+c)/2f;
		area =(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		//System.out.println("Your entered sides of triangles are " + a , b, c + "respectively"); wrong line
		System.out.println("Area of triangle is: " + area);
	}
}