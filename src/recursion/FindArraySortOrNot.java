package recursion;

public class FindArraySortOrNot {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
        System.out.println(SortOrNot(arr,0));
    }
    public static boolean SortOrNot(int arr[],int si){
        if(arr.length-1 == si){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }else{
            boolean Sort = SortOrNot(arr,si+1);
            return Sort;
        }
    }
}
