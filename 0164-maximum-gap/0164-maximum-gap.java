class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1)
        return 0;
        Arrays.sort(nums);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(ans<nums[i+1]-nums[i]){
                ans=nums[i+1]-nums[i];
            }
        }
        return ans;
    }
}