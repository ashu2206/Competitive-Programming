class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
        int left[]=new int [n];
        int right[]=new int [n];
        left[0]=prices[0];
        right[n-1]=prices[n-1];
        for(int i=1;i<n;i++)
            left[i]=Math.min(left[i-1],prices[i]);
        for(int j=n-2;j>=0;j--)
        {
            right[j]=Math.max(right[j+1],prices[j]);
        }
        int profit=0;
        for(int i=0;i<n;i++)
        {
            profit=Math.max(profit,right[i]-left[i]);
        }
        return profit;
        
    }
    
}