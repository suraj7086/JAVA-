import java.lang.*;
class box{
	int height;
	int width;
	int length;
  
  //Different types of constructors
	box(int l, int w, int h){
       length = l;
       width = w;
       height = h;
	}
	box(int h){
		length = 1;
		width = 1;
		height = h;
	}
	box(){
		length = 1;
		width = 1;
		height = 1;
	}
	int volume(){
		return width*length*height;
	}
}
class Demonstration_3{
	public static void main(String []args){
		box b1 = new box();
		box b2 = new box(3,4,5);
		box b3 = new box(5);
		System.out.println("Volume of box b1 is " + b1.volume());
		System.out.println("Volume of box is b2 " + b2.volume());
		System.out.println("Volume of box is b3 " + b3.volume());
	}
}