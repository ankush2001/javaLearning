package recursion;

import java.util.ArrayList;

public class BoardPath {
    public static void main(String[] args){
        System.out.println(getBoardPath(0,10));
    }
    public static ArrayList<String> getBoardPath(int start , int end){
        if(start == end){
            ArrayList<String> br = new ArrayList<>();
            br.add("\n");
            return br;
        }
        if(start>end){
            ArrayList<String> br = new ArrayList<>();

            return br;
        }
        ArrayList<String> mr = new ArrayList<>();

        for(int dice = 1 ; dice<= 6 ; dice++){
            ArrayList<String> rr = getBoardPath(start + dice,end);
            for(String rrs : rr){
                mr.add(dice + rrs);
            }
        }
        return mr;
    }
}
