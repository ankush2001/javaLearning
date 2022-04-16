package ankush;

public class contiSubArr {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = Integer.MIN_VALUE;
        int ans=0;
        for(int i=0; i<nums.length ; i++){
             ans += nums[i];
           sum = Math.max(sum,ans);
            if(ans<=0){
                ans=0;
            }
        }
        System.out.println(sum);
    }
}
