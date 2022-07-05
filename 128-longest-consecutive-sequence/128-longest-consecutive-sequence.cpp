class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int maxele=1;
        int count=1;
        if(nums.size()==0)
            return 0;
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]==nums[i-1]+1)
                count++;
            else if(nums[i]!=nums[i-1])
                count=1;
            maxele=max(maxele,count);
            
        }
        return maxele;
        
    }
};