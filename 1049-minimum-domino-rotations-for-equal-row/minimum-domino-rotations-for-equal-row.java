class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int result = check(tops[0], tops, bottoms);
        if (result != -1 || tops[0] == bottoms[0]) return result;
        return check(bottoms[0], tops, bottoms);
    }

     private int check(int target, int[] tops, int[] bottoms) {
        int rotateTop = 0;
        int rotateBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1; // can't make this domino match target
            } else if (tops[i] != target) {
                rotateTop++; // need to rotate top[i] to bring target from bottom
            } else if (bottoms[i] != target) {
                rotateBottom++; // need to rotate bottom[i] to bring target from top
            }
        }

        return Math.min(rotateTop, rotateBottom);
     }
}