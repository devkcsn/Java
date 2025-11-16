import java.lang.*;
import java.util.Scanner;

class studentChallenge4
{
	public static void main(String [] args)
	{
	float height,length,breadth,areaFront,areaSide,areaTop;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length , breadth and height respectively ");
	length = sc.nextFloat();
	breadth = sc.nextFloat();
	height = sc.nextFloat();
	
	areaFront = length*height;
	areaTop = length*breadth;
	areaSide = breadth*height;
	System.out.println("Area of front or back is :" + areaFront );
	System.out.println("Area of leftside or rightside is :" + areaSide );
	System.out.println("Area of bottom or top is :" + areaTop );

	float areaTotal = 2f*(areaFront + areaTop + areaSide);
	System.out.println("Total area of all the surfaces is: " + areaTotal );

	float volume = length*breadth*height;
	System.out.println("Total volume of all the cuboid is: " + volume );
	}
}
	
	
	