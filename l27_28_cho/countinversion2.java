package l27_28_cho;

import java.io.*; 
public class countinversion2 {
    static long inv=0;
    public static void mergesort(long[] arr ,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
        public static void merge(long[] arr,int l,int mid,int r){
            int i=l;
            int j=mid+1;
            int k=l;
            long[] b=new long[arr.length];
        
            while(i<=mid && j<=r){
                if(arr[i]<arr[j]){
                    b[k]=arr[i];
                    i++;


                }else{
                    b[k]=arr[j];
                    j++;
                    inv+=(mid-i+1);

                }
                k++;
            }
            if(i>mid){
                while(j<=r){
                    b[k]=arr[j];
                    j++;
                    k++;
                }
            }else{
                while(i<=mid){
                    b[k]=arr[i];
                    i++;
                    k++;
                }
            }
            for(int t=l;t<=r;t++){
                arr[t]=b[t];
            }
        }
    
    public static long getInversions(long arr[], int n) {
    mergesort(arr,0,n-1);
    return inv;
    }
}
