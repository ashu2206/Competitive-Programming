class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
                min=nums[i];
        }
        return min;
    }
}