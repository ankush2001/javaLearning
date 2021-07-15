package allQuestions;
import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        //taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        //taking total count of testcases
        int t = sc.nextInt();
        while(t-- > 0)
        {
            //taking total number of elements
            int n = sc.nextInt();

            //taking size of subArrays
            int k = sc.nextInt();

            //Declaring and Intializing an array of size n
            int arr[] = new int[n];

            //adding all the elements to the array
            for(int i = 0; i <n; i++)
            {
                arr[i] =sc.nextInt();
            }

            //Calling the method max_of_subarrays of class solve
            //and storing the result in an ArrayList
            ArrayList <Integer> res = new solve().max_of_subarrays(arr, n, k);

            //printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
    }
}


class solve{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
            Deque<Integer> window = new LinkedList<>();
            ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        if(n<=1) return  answer;
        for(;i<k;i++){
            while(!window.isEmpty() && arr[window.peekLast()] <= arr[i]){
                window.removeLast();
            }
            window.addLast(i);
        }
        for(;i<n;i++){
            answer.add(arr[window.peek()]);
            while (!window.isEmpty() && window.peekFirst() <= i-k){
                window.removeFirst();
            }
            while(!window.isEmpty() && arr[window.peekLast()] <= arr[i]){
                window.removeLast();
            }
            window.addLast(i);
        }
        answer.add(arr[window.peek()]);
            return answer;
    }
}