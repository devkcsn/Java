import java.lang.*;


class Rectangle {

int length;
int breadth;

Rectangle (int l , int b){

this.length = l;
this.breadth = b; }

void display(){
System.out.println("Length: " + this.length);
System.out.println("Breadth: " + this.breadth);

}

public static void main(String [] args){
Rectangle r1 = new Rectangle(10,5);
r1.display();

Rectangle r2 = new Rectangle(7,20);
r2.display();

}

}