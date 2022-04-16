package ankush.Pattern;

public class first {
    public static void main(String[] args) {
        int n=20;

        for(int i=0 ; i<=n ; i+=2){
            for (int j=i ; j<=n ; j++){
                System.out.print(" ");
            }
            for ( int j =1 ; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //opposite
        for(int i=n-2 ; i>0 ; i-=2){
            for (int j=i ; j<=n ; j++){
                System.out.print(" ");
            }
            for ( int j =2 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
