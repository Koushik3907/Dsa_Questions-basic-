package basic_questions;
import java.util.*;
public class Primenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i==n/i){
                    count=count+1;
                }
                else{
                    count=count+2;
                }
            }
        }
      if(count==2){
          System.out.println("Yay");
      }
        else{
            System.out.println("Nay");
        }
    }
}
