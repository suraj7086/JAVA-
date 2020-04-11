import java.util.*;
class Demonstration_6{
public static void main(String args[]){
     int sum =0;
     float avg;
	Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the numbers");
    ArrayList <Integer> l = new ArrayList <Integer> ();
    while(scnr.hasNextInt()){
    	l.add(scnr.nextInt());
    }
    for(int i=0;i<l.size();i++){
    	sum=sum+l.get(i);
    }
    System.out.println("Sum of values are "+ sum);
    int size;
    size=l.size();
    avg = sum/size;
    System.out.println("average is :" + avg);
}
}