package basic_questions;
import java.util.*;
public class Square_root {
	  public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int ans =1;
	        for(int i=1;i*i<=n;i++){
	            ans=i;
	        }
	        System.out.println(ans);
	    }
}
