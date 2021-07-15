package rearrangeArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Alternately {

        public static void rearrange(int arr[], int n){
            int temp[] = arr.clone();
            int small = 0;
            int large= arr.length - 1;
            boolean flag = true;
            for(int i= 0 ; i<n ; i++) {
                if (flag) {
                    arr[i] = temp[large];
                    large--;
                } else {
                    arr[i] = temp[small];
                    small++;
                }

                flag = !flag;
            }

        }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        rearrange(arr,n);
        for(int a : arr){
            System.out.print(a+" ");
        }

        }

    }

