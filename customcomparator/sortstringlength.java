package customcomparator;
import java.util.*;
public class sortstringlength {
    public static void main(String[] args) {
        Comparator<String>com =new Comparator<>(){
            public int compare(String a,String b){
                if(a.length()>b.length()){
                    return 1;
                }else{
                    return -1;

                }
            }
        };
        List<String>ks=new ArrayList<>();
        ks.add("nitin");
        ks.add("hii");
        ks.add("dd");
        ks.add("tttt");
        ks.add("okiamhere");
        Collections.sort(ks,com);
        System.out.println(ks);

    }
    
}
