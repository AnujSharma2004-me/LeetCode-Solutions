class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] ans =new int[n];
        if(k==0)
        return nums;
        for(int i=0; i<n; i++)
        {
            ans[i] =-1;

        } 
        int win=2*k+1;
        if(win>n)
        return ans;
        long sum =0;
        for(int i=0; i<win; i++)
        {
            sum +=nums[i];

        }

        int mid=k,left=0;
        ans[mid++] = (int)(sum/win);
        for(int i=win; i<n; i++)
        {
            sum =sum-nums[left++];
            sum = sum+nums[i];
            ans[mid++] =(int)(sum/win);
    
        }
        return ans;
        
    }
}