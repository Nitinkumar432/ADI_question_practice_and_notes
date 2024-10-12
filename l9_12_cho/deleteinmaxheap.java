package l9_12_cho;
import java.util.*;
public class deleteinmaxheap {
    public static void delete(int arr[],int n){
    arr[1]=arr[n];
    n=n-1;
    int i=1;
    while(i<n){
        int left=arr[2*i];
        int right=arr[2*i+1];
        int larger=left>right?2*i : 2*i+1;
        if(arr[i]<arr[larger]){
            swap(arr[i],arr[larger]);
            i=larger;
        }else{
            return;
        }
    }


    }
    public static void main(String[] args) {
        
    }
    
}
