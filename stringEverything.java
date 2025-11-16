import java.lang.*;

class stringEverything{

	public static void main (String [] args){
		


		//char c[] = {'A','B','C'};
		//String str0 = new String(c);
		//System.out.println(str0);
		//String str1 = new String(c,1,2);
		//System.out.println(str1);
		//String str2 = "Java" ; 
		//System.out.println(str2);


		//String pool vs String object 
		String s = "Java";
		String y = new String("Java");
		System.out.println(s==y);
		
		//Final Showdown 

		String str = "www.abcd.org";
		
		boolean b =str.startsWith("www");
		System.out.println(b);
		b =str.endsWith("rg");
		System.out.println(b);
		char c = str.charAt(7);
		System.out.println(c);
		int a = str.indexOf("ab");
		System.out.println(a);
		a = str.indexOf("cd");
		System.out.println(a);
		
	}
}