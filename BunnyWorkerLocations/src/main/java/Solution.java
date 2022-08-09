public class Solution {
    public static void main(String[] args) {

    }

    public static String solution(long x, long y) {
        long currY = 1;
        long total = currY;
        for (int i = 0; i < y; i++) {
            currY += i;
            total = currY;
        }
        for (int i = 1; i < x; i++) {
            total += (y+i);
        }
        return String.valueOf(total);
    }

}
