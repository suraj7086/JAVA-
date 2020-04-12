import java.util.*;
import java.lang.*;
class circle{
	int x,y;
	double r;
	static int count = 0;
	circle(int x,int y,double r){
		this.x = x;
		this.y = y;
		this.r = r;
        count++;
	}
	circle(double r){
         this(10,10,r);
         count++;
	}
	circle(circle c){
		this.x = c.x;
		this.y = c.y;
		this.r = c.r;
		count++;
	}
	circle(){
		this(10);
		count++;
	}
	double perimeter(){
		return 2*3.14*r;
	}
}
class classVariable{
	public static void main(String args[]){
	
		circle c4 = new circle();
		System.out.println("value of static count in circle 4 is " + c4.count + " Expected result is 3");
		circle c1 = new circle(2,2,2.0);
		System.out.println("value of static count in circle 1 is "+ c1.count +" Expected result is 4");
		circle c2 = new circle(2.0);
		System.out.println("value of static count in circle 2 is " + c2.count +" Expected result is 6");
		circle c3 = new circle(c1);
		System.out.println("value of static count in circle 3 is " +c3.count  + " Expected result is 7");
	}
}