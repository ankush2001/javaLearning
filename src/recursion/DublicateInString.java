package recursion;

import java.util.Scanner;

public class DublicateInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        deleteDuplicate(str);
    }
    public static void deleteDuplicate(String str){
        if(str.length() <= 1){
            System.out.print(str);
            return;
        }
        if(str.charAt(0) == str.charAt(1)){
           deleteDuplicate(str.substring(1));
        }else{
            System.out.print(str.charAt(0)+" ");
            deleteDuplicate(str.substring(1));
        }
    }
}
