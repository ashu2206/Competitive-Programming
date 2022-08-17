class Solution {
public:
    void sortColors(vector<int>& nums) {
       int low=0,mid=0;
        int high=nums.size()-1;
        int temp;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
                
            }
            else {
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            
        }
    }
        

};