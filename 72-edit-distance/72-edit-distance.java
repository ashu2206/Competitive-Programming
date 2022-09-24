class Solution {
    public int minDistance(String word1, String word2) {
       int m=word1.length();
       int n=word2.length();
        char str1[]=word1.toCharArray();
        char str2[]=word2.toCharArray();
        int dp[][]=new int [m+1][n+1];
        dp[0][0]=0;
         for(int i=0;i<dp[0].length;i++)
        {
           dp[0][i]=i;
        }
         for(int j=0;j<dp.length;j++)
        {
           dp[j][0]=j;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)

            {
                if(str1[i-1]==str2[j-1])
                    dp[i][j]=dp[i-1][j-1];
                else 
                    dp[i][j]=1+min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
            }
        }
        return dp[m][n];
        
    }
    public static int min(int a,int b,int c)
    {
        int d=Math.min(a,b);
        int e=Math.min(d,c);
        return e;
    }
}