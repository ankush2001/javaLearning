package questions;




class nn {

    public static void main(String[] args) {
        int k=2;

        int[] nums ={1,2};
        k = k % nums.length;
        int left = 0 ;
        int right = nums.length-k-1;

        if(nums.length == 1){
            return;
        }
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        left = nums.length-k;
        right=nums.length-1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}