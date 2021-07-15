package recursion.Print;

public class PrintSubSequence {
    static int j =0;
    public static void main (String[] args){
        countSS("abc","");
        System.out.println(j);
        PrintSS("abc","");

    }
    public static void countSS(String str , String res){
        if(str.length()==0)
        {
            j++;
            return;
        }
        char cc=str.charAt(0);
        String ros=str.substring(1);
        countSS(ros,res);
        countSS(ros,res+cc);

    }
    public static void PrintSS(String str , String res){

        if(str.length() == 0){
            System.out.print(res+" ");
        return;
    }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        PrintSS(ros,res);
        PrintSS(ros,res+cc);

    }

}

