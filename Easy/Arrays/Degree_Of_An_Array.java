class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(left.get(nums[i])==null)
                left.put(nums[i],i);
            right.put(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int max = Collections.max(count.values());
        int result = nums.length;
        for(Integer x: count.keySet())
        {
            if(count.get(x)==max)
            {
                result = Math.min(result,right.get(x) - left.get(x) + 1);
            }
        }
        return result;        
    }
}
