package sortingalgo;

public class mergesort {
    public static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);

        }
        
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int[]b=new int[arr.length];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }else{
                b[k]=arr[j];
                j++;
            }
            k++;
            
        }
        if(i>mid){
            while(j<=r){
                b[k]=arr[j];
                k++;
                j++;

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
    public static void main(String[] args){
        int arr[]={6,5,4,5,3,5,4,6};
        int n=arr.length;
        mergesort(arr,0,n-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
}
