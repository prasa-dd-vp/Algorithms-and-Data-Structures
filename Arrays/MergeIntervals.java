class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<int[]>();
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        result.add(new int[]{intervals[0][0], intervals[0][1]});
        
        for (int i=1; i<intervals.length; i++) {
            int[] arr = result.get(result.size()-1);
            if (arr[0] <= intervals[i][0] &&
                intervals[i][0] <= arr[1]) {
                arr[1] = Math.max(arr[1], intervals[i][1]);
            } else {
                result.add(new int[]{intervals[i][0], intervals[i][1]}); 
            }    
        }
        
        return result.toArray(new int[result.size()][]);
    }
}