package recursion.Print;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args){
        //PrintBp(0,10,"");
        //PrintPerm("abc","");
        MazePathD(0,0,2,2,"");
    }
    public static void PrintPerm(String ques , String ans) {
        if (ques.length() == 0) {
        System.out.println(ans);
        return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char cc = ques.charAt(0);
            String ros = ques.substring(0, i) + ques.substring(i + 1);
            PrintPerm(ros,ans+cc);
        }
    }
    public static void PrintBp(int curr , int end , String ans){
        if(curr == end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        //i can be refer as dice
        for(int i=1 ; i<=6 ; i++){
            PrintBp(curr+i,end,ans+i);
        }
    }
    public static void MazePath(int cr , int cc , int er , int ec , String ans){
        if(cr == er && cc == ec){
            System.out.print(ans+" ");
            return;
        }
        if(cr>er || cc > ec){
            return;
        }
            MazePath(cr,cc+1,er,ec,ans+"H");
        MazePath(cr+1,cc,er,ec,ans+"V");
    }
    public static void MazePathD(int cr , int cc , int er , int ec , String ans){
        if(cr == er && cc == ec){
            System.out.print(ans+" ");
            return;
        }
        if(cr>er || cc > ec){
            return;
        }
        MazePathD(cr,cc+1,er,ec,ans+"H");
        MazePathD(cr+1,cc,er,ec,ans+"V");
        MazePathD( cr+1,cc+1,er,ec,ans+"D");
    }
}
