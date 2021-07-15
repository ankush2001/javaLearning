package recursion;

import java.util.ArrayList;

public class MazeBoardPath {
    public static void main(String [] args){
    System.out.println(getMazePathD(0,0,2,2));
    }
//    public static ArrayList<String> getMazePath(int currentRow, int currentColumn , int eRow , int eColumn){
//
//        if(currentRow == eRow && currentColumn == eColumn){
//            ArrayList<String> br = new ArrayList<String>();
//            br.add("");
//            return br;
//        }
//        if(currentColumn > eColumn || currentRow > eRow){
//            ArrayList<String> br = new ArrayList<String>();
//            return br;
//        }
//
//        ArrayList<String> mr = new ArrayList<String>();
//
//        ArrayList<String> rrh = getMazePath(currentRow,currentColumn+1,eRow,eColumn);
//
//        for (String rrhs : rrh){
//            mr.add("H" + rrhs);
//        }
//
//        ArrayList<String> rrv = getMazePath(currentRow+1,currentColumn,eRow,eColumn);
//        for (String rrhvs : rrv){
//            mr.add("V" + rrhvs);
//        }
//
//        return mr;
//    }

    public static ArrayList<String> getMazePathD(int currentRow, int currentColumn , int eRow , int eColumn){

        if(currentRow == eRow && currentColumn == eColumn){
            ArrayList<String> br = new ArrayList<String>();
            br.add("");
            return br;
        }
        if(currentColumn > eColumn || currentRow > eRow){
            ArrayList<String> br = new ArrayList<String>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<String>();

        ArrayList<String> rrh = getMazePathD(currentRow,currentColumn+1,eRow,eColumn);

        for (String rrhs : rrh){
            mr.add("H" + rrhs);
        }

        ArrayList<String> rrv = getMazePathD(currentRow+1,currentColumn,eRow,eColumn);
        for (String rrhvs : rrv){
            mr.add("V" + rrhvs);
        }
        ArrayList<String> rrd = getMazePathD(currentRow+1,currentColumn+1,eRow,eColumn);
        for (String rrhds : rrd){
            mr.add("D" + rrhds);
        }

        return mr;
    }
}
