class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        //Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        for(int[] cur:intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<cur[0]){
                res.add(cur);
            }
            else{
                int[] last = res.get(res.size()-1);
                last[1] = Math.max(last[1],cur[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}