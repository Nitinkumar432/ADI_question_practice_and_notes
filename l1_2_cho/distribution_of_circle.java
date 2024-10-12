package l1_2_cho;
import java.util.*;
public class distribution_of_circle {
    public static int distributionofcir(int n,int m,int k){
        if(m<=n-k+1){
            return m +k -1;
        }
        m=m-(n-k+1);
        return (m%n==0) ? n : (m%n);
      
    }
    // 2nd wat to that
    public static int distributionofcir2(int a,int b,int c){
        int x=((c-b-1)%a);
        if(x==0){
            return a;
        }
        return x;
      
    }

    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    int x=distributionofcir(n,m,k);
    System.out.println(x);
    // n total size of circle 
    // m total items 
    //k =intial position
    int y=distributionofcir2(n,m,k);
    System.out.println(y);
    }
   
    
    

    
}
