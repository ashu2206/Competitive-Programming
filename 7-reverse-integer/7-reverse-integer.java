class Solution {
    public int  reverse(int x) {
//         boolean isNegative =x<0;
//         if(isNegative)
//         {
//             x=x*-1;
//         }
//         long ans=0;
        
//         while(x>0)
//         {
//             int rem=x%10;
//             ans=ans*10+rem;
//             x/=10;
//         }
//         int temp=(int)ans;
//        return isNegative?temp*-1:temp;
       long res =0;
        
        
        while(x!=0){
            res = res*10 + x%10;
            x=x/10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE)
            return 0;
        
            return (int)res;
        
    }
}