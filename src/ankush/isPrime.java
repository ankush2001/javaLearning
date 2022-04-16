package ankush;

public class isPrime {
    static boolean isPrime(int n){
        int flag=1;
        if(n<=1){
            return false;
        }
        for(int i=2 ; i<=n/2 ; i++){
            if(n%i==0){
               flag++;
            }
        }
        if (flag==1){
            return true;
        }else {
            return false;
        }

    }
//    static void printPrime(int n){
//            for(int i=2 ; i<n ; i++){
//                if(isPrime(i)){
//                    System.out.println(i);
//                }
//            }
//    }
    public static void main(String[] args) {
        int n=2;
        System.out.println( isPrime(n));
    }
}
