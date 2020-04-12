import java.util.*;
public class commandline{
	public static void main(String args[]){
		if(args.length>0){
			System.out.println("Commandline arguments are :");
			for(String val:args){
				System.out.println(val);
			}
		}
		else
		{
			System.out.println("No commandline arguments are found");
		}
	}
}