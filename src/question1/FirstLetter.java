package question1;

import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();

        for(int i=0 ; i<first.length(); i++){
            if(first.charAt(i) != ' '){
                if(i== 0){
                    System.out.println(first.charAt(i));
                }else if(first.charAt(i-1) == ' '){
                    System.out.println(first.charAt(i));
                }
            }
        }
      /*  String word[] = S.split(" ");
        for(int i = 0 ; i<word.length ; i++){
            String d = word[i];
            System.out.print(d.charAt(0));
        }*/

    }
}
