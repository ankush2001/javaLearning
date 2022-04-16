package questions;

public class firstPalindrome {

    public static String firstPalindrome(String[] words) {
       for(String str : words){
           if(isPalindrome(str.toCharArray()))
           return str;
       }
            return "";
        }
    private static boolean isPalindrome(char[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left++] != arr[right--]){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String  words[] = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}
