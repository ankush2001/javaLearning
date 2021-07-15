package timeAndSpace;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i <N ; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        for(int e : arr){
            System.out.print(e+" ");
        }

    }
    //merging two sorted arrays
    public static int[] mergeTwoSortedArrays(int[] arr, int[] arr1){
        int merged = arr.length + arr1.length;
        int ans[]  = new int[merged];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr.length && j<arr1.length){
            if(arr[i]<arr1[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }else{
                ans[k]=arr1[j];
                j++;
                k++;
            }
            if(i==arr.length){
                while(j< arr1.length){
                    ans[k]=arr1[j];
                    j++;
                    k++;
                }
            }
            if(j==arr1.length){
                while(i< arr.length){
                    ans[k]=arr[i];
                    k++;
                    i++;
                }
            }
        }
    return ans;
    }
    //merge sort algo recursion based
    public static int[] mergeSort(int[] arr, int low ,int high) {
        //base case
        if(low == high){
            int br[] = new int[1];
            br[0] = arr[low];
            return br;
        }
            int mid = (low + high) / 2;
            int fh[]= mergeSort(arr,low,mid);
            int sh[] = mergeSort(arr,mid+1,high);
            int ans[] = mergeTwoSortedArrays(fh,sh);
            return ans;

    }

    public static void quickSort(int[] arr, int low, int high){
       //base case
        if(low>=high){
             return;
        }
        //1. partitioning
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int left = low;
        int right = high;

        while(left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while(arr[right]>pivot){
                right--;
            }
            //changing values
            if (left<=right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            //smaller problem
            quickSort(arr,low,right);
            quickSort(arr,left,high);
        }

    }

}
