package l9_12_cho;
import java.util.*;
public class inserteleinmaxheap {
    public static void insert(arr[],n,value);
    n=n+1;
    arr[n]=value;
    int i=n;
    while(i>1){
        int parent=i/2;
        if(a[parent]<a[i]){
            swap(a[parent],a[i]);
            i=parent;
        }else{
            return ;
        }
    }

    public static void main(String[] args) {
        
    }
    
}
