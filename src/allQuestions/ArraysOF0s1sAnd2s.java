package allQuestions;

public class ArraysOF0s1sAnd2s {
    public static int[] Sorting(int arr[], int n){
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                //swap
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                //swap
                swap(arr,mid,high);
                high--;
            }
        }
    return arr;
    }

    public static void swap(int arr[], int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1,1,0,2,2,0,2};
        Sorting(arr,n);
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

}
