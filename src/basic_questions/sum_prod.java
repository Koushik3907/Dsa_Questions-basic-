package basic_questions;
import java.util.*;
public class sum_prod {

	    public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        
	        System.out.println(subtractProductAndSum(n));
	    }
	    
	    public static int subtractProductAndSum(int n) {
	        int sum =0;
	        int multiply = 1;

	        while(n>0){
	            int lastdigit = n%10;

	            sum = sum + lastdigit;
	            multiply = multiply*lastdigit;

	            n = n/10;
	        }

	        return multiply - sum;
	    }
	}
//leet code des :https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
