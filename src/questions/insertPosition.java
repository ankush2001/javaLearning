package questions;

public class insertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        insertPosition ss = new insertPosition();
        int nums[] = {1,3,2,6};
        System.out.println(ss.searchInsert(nums,0));
    }
}
