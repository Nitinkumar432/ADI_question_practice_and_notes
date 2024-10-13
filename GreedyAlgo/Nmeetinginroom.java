package GreedyAlgo;
import java.util.*;
class Meeting{
    int start,end;
    Meeting(int start,int end){
        this.start=start;
        this.end=end;
    }
}
public class Nmeetinginroom {
    public static int Maxmeeting(int n,int[] start,int[]end){
        Meeting[] meetings=new Meeting[n];
        for(int i=0;i<n;i++){
            meetings[i]=new Meeting(start[i],end[i]);
        }
        Arrays.sort(meetings,Comparator.comparingInt(meeting->meeting.end));
        int count=0;
        int lastendtime=-1;
        for(int i=0;i<n;i++){
            if(meetings[i].start>lastendtime){
                count++;
                lastendtime=meetings[i].end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        int n=start.length;
        int result=Maxmeeting(n,start,end);
        System.out.println("Maximum meeting "+result);

        
        
    }
    
}
