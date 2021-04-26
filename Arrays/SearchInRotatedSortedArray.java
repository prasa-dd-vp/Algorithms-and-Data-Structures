class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length,
            start = 0,
            end = n - 1,
            middle = 0,
            realMiddle,
            pivot;
        
        while (start < end) {
            middle = start + (end-start)/2;
            if (nums[middle] > nums[end]) start = middle + 1;
            else end = middle;
        }
        
        pivot = start;
        
        start = 0;
        end = n - 1;
        while (start <= end) {
            middle = start + (end-start)/2;
            realMiddle = (middle+pivot)%n;
            if (nums[realMiddle] == target) return realMiddle;
            if (nums[realMiddle] < target) start = middle + 1;
            else end = middle - 1;
        }
        
        return -1;
    }
}