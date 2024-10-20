package sortingalgo;
import java.util.*;

public class QuickSort {
    public static void quicksort(int[] arr,int l,int h ){
        if(l<h){
            int pivot=partition(arr,l,h);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,h);
        }

    }
    public static int partition(int[] arr,int l,int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(i<h && arr[i]<=pivot){
                i++;
            }
            while(j>l && arr[j]>pivot){
                j--;
            }
            if(i<j){
                int x=arr[i];
                arr[i]=arr[j];
                arr[j]=x;
            }
        }
        int x=arr[l];
        arr[l]=arr[j];
        arr[j]=x;
        return j;

    }
    public static void main(String[] args) {
        int[] arr={4,3,2,3,45,3};
        int l=0;
        int h=arr.length-1;
        quicksort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
    
}
