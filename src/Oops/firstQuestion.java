package Oops;

import java.util.Scanner;

public class firstQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("---BEFORE----");
        disElement(arr);
        System.out.println();
        System.out.println("---AFTER----");
        doubleVal(arr);

        disElement(arr);
    }
    public static void doubleVal(int arr[]){
        for(int i=0 ;i< arr.length; i++){
            arr[i]*=2;
        }
    }
    public static void disElement(int arr[]){
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
