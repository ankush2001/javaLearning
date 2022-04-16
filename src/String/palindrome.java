package String;

public class palindrome {
    public static void main(String[] args) {
        String input = "abc";

        int first = 0;
        int last = input.length()-1;
        while(first<last){
            if(input.charAt(first)!=input.charAt(last)){
                System.out.println("0");
            }else{
                System.out.println("1");
                break;
            }
            first++;
            last--;

        }
    }
}
