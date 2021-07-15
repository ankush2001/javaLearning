package allQuestions;

import java.util.Arrays;

public class Soe {
    public static void primeNo(int n){
        //initially boolean array is false
        boolean primes[] = new boolean[n+1];
        //making it to true
        Arrays.fill(primes,true);
        primes[0] = primes[1] = false;
        for(int table = 2; table * table <= n ; table++){
            if(primes[table]==false){
                continue;
            }
            for(int mult = 2; table * mult <=n ; mult++){
            primes[table*mult] = false;
            }
        }
        for (int i = 0 ; i < primes.length ; i++){
            if(primes[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        //time complexity = nloglogn
        primeNo(300);
    }
}
