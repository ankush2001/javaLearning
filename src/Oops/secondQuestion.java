package Oops;

public class secondQuestion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr1[] = {5,6,7,8,9};
        mergeTwoArrays(arr,arr1);


    }
    public static void mergeTwoArrays(int[] arr1, int[] arr2){
        int merged = arr1.length + arr2.length;
        int arr3[]  = new int[merged];
        int i = 0, j = 0, k = 0;
        while (i< arr1.length && j < arr2.length)
        {

            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (i < arr1.length)
            arr3[k++] = arr1[i++];

        while (j < arr2.length)
            arr3[k++] = arr2[j++];

        for(i=0 ; i< arr3.length ; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
