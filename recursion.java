
// provide input in cmd

import java.util.*;
import java.lang.*;
//factorial using recursion.
class factorial_recursion{
   
   public int n;
   int factorial(int x)
   {
   	 if(x ==1 || x==0)
   	 {
   	 	return (1);
   	 }
   	 else{
   	 	return (x*factorial(x-1));
   	 }
        
   }
}

class recursion{
	public static void main(String args[]){
		factorial_recursion f = new factorial_recursion();
		f.n = Integer.parseInt(args[0]);
         System.out.println("factorial is : " + f.factorial(f.n));

	}
}

