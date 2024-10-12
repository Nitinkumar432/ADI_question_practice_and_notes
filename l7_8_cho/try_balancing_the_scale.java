package l7_8_cho;
import java.util.*;
public class try_balancing_the_scale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,6};
        int n=arr.length;
        int weightDifference = 5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                ArrayList<Integer>ar=new ArrayList<Integer>();
                for(int k=i;k<=j;k++){
                    ar.add(arr[k]);
                    sum+=arr[k];



            }
            if(sum==weightDifference){
            System.out.println(ar+" "+sum);
            }
        }
        
    }
}
    
}
