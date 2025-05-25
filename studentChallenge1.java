import java.lang.*;
import java.util.Scanner; 

class studentChallenge1
{
	public static void main(String [] args)
	{
		System.out.print("Enter the value of base of triangle: ");
		Scanner sc = new Scanner(System.in);
		float base = sc.nextFloat();
		System.out.print("Enter the value of height of triangle: ");
		float height = sc.nextFloat();
		float area = (base*height)/2;
		System.out.println("Area of triangle is: " + area );
	}
}
