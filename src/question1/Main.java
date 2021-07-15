package question1;

import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        StringRedOrGreen aa = new StringRedOrGreen();
        System.out.println(aa.redOrGreen(N,S));

    }
}

    //Given a string of length N, made up of only uppercase characters 'R' and 'G',
    // where 'R' stands for Red and 'G' stands for Green
    // //.Find out the minimum number of characters you need
    // to change to make the whole string of the same colour.
    class StringRedOrGreen {
        static int redOrGreen(int N , String S){
            int Red = 0;
            int Green = 0;
            for(int i=0; i<N ; i++) {
                char ch = S.charAt(i);
                if (ch == 'R') {
                    Red++;
                } else
                    Green++;

            }

            return min(Red , Green);
        }
    }

