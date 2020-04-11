import java.lang.*;
class circle{
	//Declare variables
	// x and y are coordinates of circle
	 int x;
	 int y;
	double r;
	double perimeter(){
		return 2*3.14*r;
	}
	double area(){
		return 3.14*r*r;
	}

}

class Demonstration_2{
   public static void main(String args[]){
   	circle c1 = new circle();
   	c1.x = 0;
   	c1.y = 0;
   	c1.r = 10.00;
   	System.out.println("Perimeter of cirlce is " + c1.perimeter());
   	System.out.println("Area of circle is " + c1.area());
   }
}