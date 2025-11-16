import java.util.Scanner;

class ReadKeyboard{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String [] args){
	sc.useRadix(2);
	int x = sc.nextInt();
	System.out.println(x);
	}
}