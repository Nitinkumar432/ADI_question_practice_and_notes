package Binarysearch;
import java.util.*;
public class binarysearchimp {
    public static int binarysearch(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){

                return 1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {2, 5, 8, 12, 16,22,22, 23, 38, 56, 72, 91};
        int target = 23;
        int check=binarysearch(arr,target);
        System.out.println(check);
    }
    
}
