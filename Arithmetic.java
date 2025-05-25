import java.lang.*;

class Arithmetic
{
	public static void main(String[]args)
	{
		float a = 14.3f, b = 3.2f;
		float c=a/b;
		float r=a%b;

		System.out.println(c);
		System.out.println(r);

		int e = 14, f = 3;
		float g=(float)e/f  ;
		int h=e%f;
		int i=e/f;

		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

		char o = 40;
		int m = 30;
		
		int n = o+m;
		int p = o-m;

		System.out.println(n);
		System.out.println(p);


	}
}