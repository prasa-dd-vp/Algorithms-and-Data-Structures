class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        if (nums.length == 0) return new int[]{-1,-1};
        
        int start = 0,
            end = nums.length - 1,
            middle = 0,
            index = -1;
        
        while (start <= end) {
            middle = start + (end - start)/2;
            if (target <= nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            if (nums[middle] == target) index = middle;
        }
        result[0] = index;
        
        start = 0;
        end = nums.length - 1;
        middle = 0;
        index = -1;
        
        while (start <= end) {
            middle = start + (end - start)/2;
            if (target >= nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
            if (nums[middle] == target) index = middle;
        }
        result[1] = index;
            
        return result;
    }
}