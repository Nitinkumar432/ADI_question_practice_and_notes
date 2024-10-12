package l7_8_cho;

import java.util.HashMap;
import java.util.Scanner;

public class try_balancing2 {
     public static void main(String[] args) {
        int[] arr={1,2,3,6,6,5};
        int n=arr.length;
        int weightdiff=6;
        HashMap<Integer,Integer>hs=new HashMap<>();
        hs.put(0,-1);
        int cs=0;
        for(int i=0;i<n;i++){
            cs+=arr[i];
            if(hs.containsKey(cs-weightdiff)){
                int st=hs.get(cs-weightdiff)+1;
                int ed=i;
               
                for(int j=st;j<=ed;j++){
                    System.out.print(arr[j]+" ");


                }
                System.out.println(weightdiff);
                
                
            }
            hs.putIfAbsent(cs,i);
        }

       
     }
 }