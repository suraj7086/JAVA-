import java.lang.*;
import java.util.*;
// fibonacci series using recursion
class fibonacci_recursion{
	public int num;
	int fibonacci( int n){	
	if(n == 0){
		return (0);
	   }
	else if (n == 1) {
		return (1);
	    }
	else{
		return (fibonacci(n-1)+fibonacci(n-2));
	    }
    }
}
class Demonstration_15{
	public static void main(String args[]){
		fibonacci_recursion f = new fibonacci_recursion();
		f.num = Integer.parseInt(args[0]);
		for(int i=0;i<f.num;i++){
			System.out.print(f.fibonacci(i) + " ");
		}
	}
}