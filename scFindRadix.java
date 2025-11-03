import java.util.Scanner;

class scFindRadix{
public static Scanner sc = new Scanner(System.in);
	public static void FindRadix(String str){
	if(str.matches("[0-1]+")){
	System.out.println("Binary Number");}
	else if(str.matches("[0-7]+")){
	System.out.println("Octal Number");}
	else if(str.matches("[0-9]+")){
	System.out.println("Decimal Number");}
	else if (str.matches("[0-9a-fA-F]+")){
	System.out.println("HexaDecimal Number");}
	else {
	System.out.println("Invalid input no Radix Found");}
}
	public static void main(String [] args){
	FindRadix(sc.nextLine());
	sc.close();}
	
}
	