package ankush;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        while(n>1){

            ans = ans*n;

            n--;

        }
        System.out.println(ans);

    }
}
