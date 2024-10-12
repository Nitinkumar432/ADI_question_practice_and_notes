package GreedyAlgo;
import java.util.*;
public class knapsackprob {
    public static int knapsack(int[]values,int[]weight,int W,int n){
        int[][]dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(i==0 || w==0){
                    dp[i][w]=0;
                }
                else if(weight[i-1]<=w){
                    dp[i][w]=Math.max(dp[i-1][w],values[i-1]+dp[i-1][w-weight[i-1]]);
                }else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] values={60,100,120};
        int[]weight={10,20,30};
        int w=50;
        int n=values.length;
        int maxvalue=knapsack(values,weight,w,n);
        System.out.println(maxvalue);
        
    }
    
}
