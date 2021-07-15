package recursion;

public class PdiSkip {
    public static void skip(int n){
       if(n==0){
           return;
       }
        if(n%2==1){
            System.out.println(n);
        }
        skip(n-1);
        if(n%2==0){
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        skip(5);
    }
}
