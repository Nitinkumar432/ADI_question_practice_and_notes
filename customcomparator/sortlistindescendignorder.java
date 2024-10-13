package customcomparator;
import java.util.*;
public class sortlistindescendignorder {
    public static void main(String[] args) {
        Comparator<Integer>com=new Comparator<>(){
            public  int compare(Integer a,Integer b ){
                if(a<b){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Scanner sc=new Scanner(System.in);
        List<Integer>ln=new ArrayList<>();
        ln.add(5);
        ln.add(4);
        ln.add(45);
        ln.add(4);
        ln.add(324);
        ln.add(22);
        Collections.sort(ln,com);
        System.out.println(ln);
        }
    
}
