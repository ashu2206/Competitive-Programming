class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    // char arr1[]=text1.toCharArray();
    // char arr2[]=text2.toCharArray();
    // int dp[][]=new int [arr1.length+1][arr2.length+1];
    // int max=0;
    // for(int i=1;i<dp.length;i++)
    // {
    //     for(int j=1;j<dp[i].length;j++)
    //     {
    //         if(arr1[i-1]==arr2[j-1])
    //             dp[i][j]=dp[i-1][j-1]+1;
    //         else 
    //             dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
    //         if(dp[i][j]>max)
    //             max=dp[i][j];
    //     }
    // }
    //     return max;
        
           int len1=text1.length();
        int len2=text2.length();
        int dp[][]=new int [len1+1][len2+1];
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else 
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                
            }
        }
        return dp[len1][len2];
        
     
    }
}