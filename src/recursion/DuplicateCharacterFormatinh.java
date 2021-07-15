package recursion;

import java.util.Scanner;

public class DuplicateCharacterFormatinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "553344";
        charFormat(str);
    }
    public static void charFormat(String str) {
        if(str.length() <= 1){
            System.out.print(str);
            return;
        }
        if (str.charAt(0) == str.charAt(1)) {
            System.out.print(str.charAt(0) + "*" + str.charAt(1));
            charFormat(str.substring(2));
        }else{
            System.out.print(str.charAt(0));
            charFormat(str.substring(1));
        }
    }
}
//public class Main {
//
//    static String duplicateChar(String s) {
//        if (s.length() <= 1) {
//            return s;
//        }
//
//        String ros = duplicateChar(s.substring(1));
//
//        if (s.charAt(0) == ros.charAt(0)) {
//            return s.charAt(0) + "*" + ros;
//        }
//
//        return s.charAt(0) + ros;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//
//        System.out.println(duplicateChar(s));
//    }
//}