class Solution {
    public boolean check(int[] nums) {
        int i,j;
        int c=0;
        for(i=0;i<nums.length;i++)
        {
            int a=0;
            c=0;
            for(j=i;a<nums.length-1;j=(j+1)%nums.length)
            {
                a++;
                if(nums[j]>nums[(j+1)%nums.length])
                    break;
                else
                    c++;
            }
            if(c==nums.length-1)
            return true;

        }
        return false;
        
    }
}