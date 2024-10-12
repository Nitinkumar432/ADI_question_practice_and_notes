package l5_6_cho;
import java.util.*;

public class hash_table_map {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>hs=new HashMap<Integer,Integer>();
        int n=sc.nextInt();
        for(int i =0;i<n;i++){
            int u=sc.nextInt();
            hs.put(u,hs.getOrDefault(u,0)+1);
        }
        // for(int key : hs.keySet()){
        //     System.out.println(key+" "+hs.get(key));

        // }
        for(Map.Entry<Integer,Integer>temp : hs.entrySet()){
            System.out.println(temp.getKey()+" "+temp.getValue());

        }

    }
    
}
