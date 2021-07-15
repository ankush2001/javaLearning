package allQuestions;

import java.util.Arrays;

public class Frequency{
    void FrequencyOfNumbers(int[] arr, int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] +" occurs "+ " " + count + " times ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,2,1,3,4,4,4};
        Frequency aa  = new Frequency();
        aa.FrequencyOfNumbers(arr,10);
    }

}
