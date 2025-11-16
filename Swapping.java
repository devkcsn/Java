import java.util.Scanner;

class Swapping{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
	int a = sc.nextInt();
	int b = sc.nextInt();

	System.out.println("a: " + a);
	System.out.println("b: "+ b);
	Swapping(a, b);}

		
	public static void Swapping(int a, int b){
	a = a^b;
	b = a^b;
	a = a^b;
	System.out.println("a: " + a);
	System.out.println("b: " + b);}

}