package allQuestions;

public class ArrayRotate {
    public static void main(String[]args){
        int n = 5;
        int arr[] = {1,2,3,4,5};
        int ar = arr[arr.length-1];
        for(int i= arr.length-1;  i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = ar;
        display(arr);
    }
    public static void display(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
