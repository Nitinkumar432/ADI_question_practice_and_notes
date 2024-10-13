package GreedyAlgo;
import java.util.*;
public class fractionalknapsack {
    public static double fractionalknapsack(int W ,double[][]items,int n){
        Arrays.sort(items,new Comparator<double[]>(){
            public int compare(double[]o1,double[]o2){
                double r1=o1[0]/o1[1];
                double r2=o2[0]/o2[1];
                return Double.compare(r2,r1);
            }

        });
        double totalvalue=0.0;
        for(int i=0;i<n;i++){
            if(W==0){
                break;

            }
            double itemweight=items[i][1];
            double itemvalue=items[i][0];
            if(itemweight<=W){
                W-=itemweight;
                totalvalue+=itemvalue;
            }else{
                totalvalue+=itemvalue*((double)W/itemweight);
                W=0;
            }
        }
        return totalvalue;
    }
    public static void main(String[] args) {
        
    
    double[][]items={
        {60,10},
        {100,20},
        {120,30}
    };
    int W=50;
    double maxvalue=fractionalknapsack(W,items,items.length);
    System.out.println(maxvalue);
}
    
    
}
