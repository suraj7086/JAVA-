import java.lang.*;
import java.util.*;
class circle{
	double r;
	circle(double r){
        this.r = r;
	}

	public circle bigger(circle a){
		if(a.r>r){
			return a;
		}
		else {
			return this;
		}
	}
	public static circle bigger(circle a,circle b){
		if(a.r>b.r){
			return a;
		}
		else{
			return b;
		}
	}
}
class classmethod{
	public static void main(String args[]){
		circle c1 = new circle(5.0);
		circle c2 = new circle(10.0);
		circle c3 = c1.bigger(c2);
		circle c4 = circle.bigger(c1,c2);
		System.out.println("Radius of circle c3 is :" + c3.r );
		System.out.println("Radius of circle c4 is :" + c4.r);	
	}
}