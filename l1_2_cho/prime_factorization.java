package l1_2_cho;
import java.util.*;
public class prime_factorization {
    public static ArrayList<Integer> primefactor(int n){
        ArrayList<Integer>factor=new ArrayList<Integer>();
        while(n%2==0){
            factor.add(2);
            n=n/2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                factor.add(i);
                n=n/i;
            }
        }
        if(n>2){
            factor.add(n);
        }
        return factor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=primefactor(n);
        System.out.println(arr);

    }
    
}
