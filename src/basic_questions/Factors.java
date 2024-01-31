package basic_questions;
import java.util.*;
public class Factors {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n =sc.nextInt();
	        int count=0;
	        System.out.println("Factors are:");
	        for(int i=1;i*i<=n;i++){
	            if(n%i==0){
	                if(i==n/i){
	                    count=count+1;
	                  //  System.out.println(","+i);
	                }
	                else{
	                    count=count+2;
	                  //  System.out.print(i+","+n/i);
	                }
	            }
	        }
	        System.out.println("\n"+count);
	    }
}
