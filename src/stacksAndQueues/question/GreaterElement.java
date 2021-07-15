package stacksAndQueues.question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GreaterElement {
    //O(N^2)
    public static void GE(int arr[]){
        int first = arr[0];
        for(int i =0 ; i < arr.length-1; i++ ){
            int next = -1;
            for(int j =i+1 ; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
        if(arr[arr.length-1]<arr[first]){
            System.out.println(arr[first]);
        }else{
            System.out.print("-1");
        }
    }
    public static void GE2(int arr[]){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i < arr.length ; i++ ){
            arr[i] = sc.nextInt();
        }

    }
}
