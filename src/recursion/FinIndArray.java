package recursion;

public class FinIndArray {
    public static void main(String[] args) {
        int arr[]  = {1,4,3,4,5,6,6};
       // System.out.println("First Index = " +firstIndex(arr,0,6));
       // System.out.println("last Index = " +  lastIndex(arr,0,6));
      int ans[] =  allIndex(arr,0,4,0);
        display(ans);
    }
    public static  int firstIndex(int arr[] , int si , int data){
       if(si == arr.length){
           return -1;
       }
      //  int abc =  firstIndex(arr,si,data);
        //int cba = firstIndex(arr,si+1,data);
        if(arr[si] == data) {
            return si;
        }else{
            int ans = firstIndex(arr,si+1,data);
            return ans;
        }

    }
    public static int lastIndex(int arr[] , int si ,int data) {
        if (si == arr.length) {
            return -1;
        }
        int index = lastIndex(arr, si + 1, data);
        if (index == -1) {
            if (arr[si] == data) {
                return si;
            } else {
                return -1;
            }
        }else {
            return index;
        }
    }

    public static int[] allIndex(int arr[],int si,int data,int count){

        if(si == arr.length){
            int base[] = new int[count];
            return base;
        }
        int ans[] = null ;
        if(arr[si] == data){
            ans = allIndex(arr,si+1,data,count+1);
        }else{
            ans = allIndex(arr,si+1,data,count);
        }
        if(arr[si] == data){
            ans[count] = si;
        }

        return ans;
        }
    public static void display(int[] arr){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
