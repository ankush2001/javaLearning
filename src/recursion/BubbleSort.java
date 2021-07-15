package recursion;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={9,5,6,7,8,1,3};
        BubbleSort(arr,0,arr.length-1);
        display(arr);
    }
    public static void BubbleSort(int arr[] , int first , int last){

        if(last==0){
            return;
        }
            if(first==last){
            BubbleSort(arr,0,last-1);
            return;
        }
            if(arr[first]>arr[first+1]){
                int temp = arr[first];
                arr[first]=arr[first+1];
                arr[first+1] = temp;
            }
            BubbleSort(arr,first+1,last);
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ,");
        }
    }
}
