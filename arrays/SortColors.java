class Solution {
    public void sortColors(int[] nums) 
    {
        int size =nums.length;
        int low=0;
        int mid=0;
        int high =size-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int t=nums[low];
                nums[low]=nums[mid];
                nums[mid]=t;
                mid++;
                low++;
            }
            else if(nums[mid]==2)
            {
                int t=nums[high];
                nums[high]=nums[mid];
                nums[mid]=t;
                high--;
            }
            else
            {
                mid++;
            }
        }

    }
}