package vectorAndStacks;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i=0 ; i<s ; i++){
            arr[i] = sc.nextInt();

        }
        for(int i= arr.length-1; i>=0 ; i--){
            System.out.println(arr[i]);
        }

    }
}
