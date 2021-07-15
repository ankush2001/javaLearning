package recursion;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0 ;i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
       System.out.println(LastElement(arr,N,M));
    }
    public static boolean IncreasingOrder(int arr[] , int N){
      if(arr == null || N < 2){
          return true;
      }else if(arr[N-2] > arr[N-1]){
          return false;
      }

      return IncreasingOrder(arr,N-1);
    }
    public static int LastElement(int arr[] , int N, int M){
        if(N<=0){
            return -1;
        }

        if(arr[N-1] == M){
            return N-1;
        }
        return LastElement(arr,N-1,M);
    }
}
