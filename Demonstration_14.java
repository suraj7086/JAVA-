import java.lang.*;
import java.lang.*;
 //fibonacci series using iteration 
class fibonacci{
	public int num1 = 0;
	public int num2 = 1;
	public int temp,num;
    
	void iteration(int num){
		System.out.println("Fibonacci Series is :");
 
       System.out.print(num1 + " " + num2 + " ");
       while(num-1>1)
       {
       	 temp = num1 + num2;
       	 num1 = num2;
       	 num2 = temp;
       	 num--;
         System.out.print(temp + " ");
       }
	}
}
class Demonstration_14{
	public static void main(String args[]){
		fibonacci f = new fibonacci();
		f.num = Integer.parseInt(args[0]);
		f.iteration(f.num);
	}
}