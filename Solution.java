
class Solution
{
    public int[] singleNumber(int[] nums)
    {
       int ans [] = new int[2];
       int res = 0;
       for(int i=0 ; i<nums.length; i++){
           res = res ^ nums[i];
       }
       
       res = res & -res;
       
       int out1 =0; int out2 =0;
       for(int i=0 ;i < nums.length; i++){
           if((res & nums[i]) > 0)
              out1 = out1 ^ nums[i];
           else
              out2 = out2 ^ nums[i];
       }
       ans[0] =out1;
       ans[1] =out2;
       Arrays.sort(ans);
       return ans;
    }
}
