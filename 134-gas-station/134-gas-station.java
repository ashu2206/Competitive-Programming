class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int current=0;
        int start=0;
        
        for(int i=0;i<gas.length;i++)
        {
            sum+=gas[i]-cost[i];
            current+=gas[i]-cost[i];
            if(current<0)
            {
                current=0;
                start=i+1;
            }
        }
        if(sum<0)
            return -1;
        return start;
        
    }
}