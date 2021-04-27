class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        backTrack(result, nums, new ArrayList<Integer>());
        
        return result;
    }
    
    private void backTrack(List<List<Integer>> result, int[] nums, ArrayList<Integer> currentArr) {
        if (currentArr.size() == nums.length) {
            result.add(new ArrayList<>(currentArr));
            return;
        }
        
        for (int i=0; i<nums.length; i++) {
            if (currentArr.contains(nums[i])) continue;
            currentArr.add(nums[i]);
            backTrack(result, nums, currentArr);
            currentArr.remove(currentArr.size()-1);
        }
        
    }
}