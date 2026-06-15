class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int size=nums.length;
        int a=0;
        int i;
        for(i=0;i<size;i++)
        {
            if (nums[i]!=0)
            {
                nums[a++]=nums[i];
            }
        }
        for(i=a;i<size;i++)
        {
            nums[i]=0;
        }
    }
}