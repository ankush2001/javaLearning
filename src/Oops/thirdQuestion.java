package Oops;

import java.util.Scanner;

public class thirdQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        for(int i=0 ; i< arr.length;i++){
            arr[i] = sc.nextInt();
           double sqrt = Math.sqrt(arr[i]);
            if(sqrt-Math.floor(sqrt)==0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
