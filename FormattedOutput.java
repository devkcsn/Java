import java.util.*;

class FormattedOutput{

public static void main(String [] args){
	System.out.printf("hello \n");

	int x = 10;
	float f = 12.56f;
	char z = 'z';
	String str = "Java Programming";
	System.out.printf("%d \n%f \n%c \n" ,x,f,z);


	int y = 10;
	System.out.printf("%1$05d \n" , y);
	System.out.printf("%1$(5d" , y);
	
	float a = 3.45f;
	System.out.printf("Hello World:" + "%6.2f" , a);
	
	float ab = 3.45646f;
	System.out.printf("%.3f" , ab);

	String strJava = "Java";
	System.out.printf("%20s \n" , strJava);

	String strJavaScript = "JavaScript";
	System.out.printf("%-20s" , strJavaScript);

}


}