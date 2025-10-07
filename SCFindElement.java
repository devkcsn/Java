import java.util.Scanner;

class SCFindElement{
public static Scanner sc = new Scanner(System.in);
public static void sum(){
	int A[] = {3,9,7,8,12,6,15,5,4,10};
	int sum = 0;
	
	for(int i = 0; i<A.length;i++){
	sum = sum + A[i];
	}
	System.out.println("Sum is: " + sum); }
	
public static void SearchingAnElement(){
	System.out.println("Enter the value you want to search in array: ");
	int key = sc.nextInt();
	int A[] = {3,9,7,8,12,6,15,5,4,10};
	for(int i = 0; i < A.length ; i++){
	if(key == A[i]){
	System.out.println("Value found at index" + i);
	System.exit(0);} 
}
	System.out.println("Key not found.");
}


public static void main(String [] args){
	//sum();
	SearchingAnElement();}
}