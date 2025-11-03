import java.util.*;

class sc3conditionalStatement {

	public static Scanner sc = new Scanner(System.in);

	public static void oddeven(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
	}
	
	public static void youngAge(int n){
	if(n>=14 && n<=55){
	System.out.println("Man is young.");}
	else if(n>=0 && n<14){
	System.out.println("He is a kid.");}
	else{
	System.out.println("Too old die.");}
	}

	public static void gradeSystem(int m1, int m2, int m3){
	int total = m1+m2+m3;
	int average = total / 3;
	if (average >= 70) {
	System.out.println("Grade: A");}
	else if (average >= 40 && average < 70) {
	System.out.println("Grade: B");
	}
	else {
	System.out.println("Fail");}}
	

	public static void main(String[] args) {
        //oddeven(sc.nextInt());
	//youngAge(sc.nextInt());
	//gradeSystem(sc.nextInt() , sc.nextInt() , sc.nextInt());
        sc.close();
	}
}
