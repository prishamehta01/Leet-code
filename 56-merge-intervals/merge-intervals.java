class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        if(intervals.length<=1) return intervals;
        for(int[] cur:intervals){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1]<cur[0]){
                merged.add(cur);
            }
            else{
                int[] last = merged.get(merged.size()-1);
                last[1] = Math.max(last[1],cur[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}