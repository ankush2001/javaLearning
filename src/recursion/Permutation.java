package recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(Permutation("abc"));
    }
    public static ArrayList<String> Permutation(String str){
       if(str.length() == 0){
           ArrayList<String> br = new ArrayList<>();
           br.add(" ");
           return br;
       }

        char ch = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> rr  = Permutation(s);
        ArrayList<String> myrResult = new ArrayList<String>();
       for(String rrs : rr){
           for(int i=0 ; i<rrs.length() ; i++){
               String val = rrs.substring(0,i) + ch + rrs.substring(i);
               myrResult.add(val);
           }
       }
       return  myrResult;
    }

}
