class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i,k=0;
        int size=nums.length;
        for(i=0;i<size-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[k++]=nums[i];
            }
        }
        nums[k++]=nums[size-1];
        return k;    
    }
}