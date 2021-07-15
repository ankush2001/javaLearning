package recursion.question;

import java.util.Scanner;

public class ReplacingPie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String str = sc.next();
            System.out.println(replace(str));
        }
    }
    public static String replace(String str){
        if (str.length() <= 1){
            return str;
        }
        if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            return  "3.14"+replace(str.substring(2));
        }else{
            return str.charAt(0)+replace(str.substring(1));
        }

    }
}
