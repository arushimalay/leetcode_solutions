class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int i,j,size=nums.length;
        int a[]=new int [2];
        for(i=0;i<size-1;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}