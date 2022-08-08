class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
         vector<int> cpy;
   copy(nums.begin(), nums.end(), back_inserter(cpy));
      for(int i=0;i<nums.size();i++)
      {
          nums[(i+k)%n]=cpy[i];
      }
    }
};