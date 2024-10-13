package Bactracking;
import java.util.*;
public class Generatenthbit {
    public static void generetenthbid(int n,String s){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        generetenthbid(n, s+"0");
        generetenthbid(n, s+"1");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generetenthbid(n,"");
    }
    
}
