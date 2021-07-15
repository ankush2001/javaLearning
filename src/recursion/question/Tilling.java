package recursion.question;

import java.util.Scanner;

public class Tilling {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        for(int j=0 ; j<a ; j++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count[] = new int[n+1];
            count[0] = 0;
            int i;
            for( i=1 ; i<=n ; i++){
                if(i>m){
                    count[i] = count[i-1] + count[i-m];
                }else if(i<m){
                    count[i] = 1;
                }else{
                    count[i] = 2;
                }
            }
            System.out.println(count[n]);

        }

    }
}
// Scanner scn = new Scanner(System.in);
//        int t=scn.nextInt();
//        while(t-->0){
//            int n=scn.nextInt();
//            int m=scn.nextInt();
//            System.out.println(tiling(n,m));
//        }
//    }
//
//    public static int tiling(int n, int m){
//
//        if(n<0)
//            return 0;
//        if(n==0)
//            return 1;
//
//        return tiling(n-1,m) + tiling(n-m,m);