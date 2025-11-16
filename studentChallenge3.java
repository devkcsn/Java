import java.lang.*;
import java.util.Scanner;

class studentChallenge3
{
	public static void main(String [] args)
	{	
		while(true){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets create a quadratic equation: input the value of coefficient of quadratic equation in sequence of a, b , c " );
		System.out.print("Enter value of a: ");
		a = sc.nextInt();
		System.out.print("Enter value of b: ");
		b = sc.nextInt();
		System.out.print("Enter value of c: ");
		c = sc.nextInt();
		
		System.out.println("Quadratic expression is " + a + "x^2 + " + b + "x + " + c );
		if((b*b)-(4*a*c) < 0  ){
		System.out.println("Determinant is negative real roots are not possible" ); 
		continue; }
		
		else{
		double r1 , r2;
		double D = Math.sqrt((b*b)-(4*a*c));
		System.out.println("Value of Determinant is: " + D);
		r1 = ( (-b) + D )/(2*a);
		r2 = ( (-b) - D )/(2*a);
		
		System.out.println("Roots are ( x + " + r1 + ") and (x + " + r2 + ")" ); }
		break;}
	}
}
