package l27_28_cho;
import java.util.*;
public class Findfrequencyofeachelement {
    public static void main(String[] args) {
        int[]arr={1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10,10};
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
               
                count++;
            }else{
                System.out.println(arr[i-1]+" "+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+" "+count);
    }
    
}
