package allQuestions;

import java.util.Scanner;

public class MiddleOfthree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = 0;
        int second = 1;
        int third = 2;
        for (int i = 0; i < arr.length-4 ; i++) {
            if (arr[first] > arr[second] && arr[first] > arr[third]) {
               System.out.print(arr[first]+" ");
                first++;
                second++;
                third++;
            }

            if (arr[first] < arr[second] && arr[second] > arr[third]) {
                System.out.print(arr[second]+" ");
                first++;
                second++;
                third++;
            }

            if (arr[first] < arr[third] && arr[second] < arr[third]) {
                System.out.print(arr[third]+" ");
                first++;
                second++;
                third++;
            }
        }
    }
}
