package recursion;

public class PrintIncr {
    //when stack was failling
    public  static void Inc(int n){
        if(n==0){
            return;
        }
        Inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
            Inc(5);
    }
}
