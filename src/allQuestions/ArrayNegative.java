package allQuestions;

import java.util.Scanner;

public class ArrayNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length ; i++){
            arr[i] = scanner.nextInt();

        }
       for (int i=0 ; i<arr.length-i; i++){
           int negative = arr[i];
           for(int j=1; j<negative; j++){
               if(arr[i+j]<0){
                   negative = arr[i+j];
               }
           }
           System.out.println(arr[i]+"");
       }
       
    }
}
