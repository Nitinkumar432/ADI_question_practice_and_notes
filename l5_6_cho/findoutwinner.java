package l5_6_cho;
import java.util.*;
public class findoutwinner {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=sum(arr[i]);
        }
        Arrays.sort(arr);
        int A=0;
        int B=0; 
        for(int i =0;i<arr.length;i++){
        if(i%2!=0){
            A+=arr[i];
        }else{
            B+=arr[i];
        }


        }
        if(A==B){
            System.out.println("Draw");
        }else if(A>B){
            System.out.println("A");
        }else if(A<B){
            System.out.println("B");

        }
    }
    
}
