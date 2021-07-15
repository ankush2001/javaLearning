package allQuestions;

import java.util.Scanner;

public class newDivid {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int arr[] = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        int mid = n/2;
        for(int k=0; k<mid ;k++){
            sum1 = sum1 + arr[k];
        }
        for(int j=mid ; j<n;j++){
            sum2 = sum2 + arr[j];
        }
        System.out.println(sum1*sum2);

    }
}
