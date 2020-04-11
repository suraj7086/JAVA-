import java.lang.*;
class box{
	int length;
	int width;
	int height;

	//constructor using this
	box(int length,int width,int height){
		this.length = length;
		this.width = width;
		this.height = height;

	}
	box(int height){
		this(1,2,height);
	}
	box(box b){
		this.length = b.length;
		this.width = b.width;
		this.height= b.height;
	}
	box(){
      length = 0;
      width = 0;
      height = 0;
	}
	int volume(){
		return length*height*width;
	}
}

class Demonstration_4{
	public static void main(String args[]){
		box b1 = new box();
		box b2 = new box(5,5,5);
		box b3 = new box(5);
		box b4 = new box(b2);
		System.out.println("Volume of box b1 is " + b1.volume());
		System.out.println("Volume of box b2 is " + b2.volume());
		System.out.println("Volume of box b3 is " + b3.volume());
		System.out.println("Volume of box b4 is " + b4.volume());
	}
}
