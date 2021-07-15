package recursion;

public class PrintingPattern {
    public static void main(String[] args) {
    patterOne(5,1,1);
    }
    public static void patterOne(int n,int row,int colm){
        if(row > n ){
            return;
        }
        if(colm>row){
            System.out.println();
            patterOne(n,row+1,1);
            return;
        }
        System.out.print("*"+" ");
        patterOne(n,row,colm+1);

    }
}
