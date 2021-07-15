package recursion;

public class PrintDecInc {
    public static void PrintInDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintInDec(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
        PrintInDec(5);
    }
}
