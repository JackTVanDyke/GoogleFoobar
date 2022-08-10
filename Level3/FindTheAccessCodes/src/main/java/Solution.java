public class Solution {
    public static void main(String[] args) {

    }

    public static int solution(int[] l) {
        int res = 0;
        if (l.length == 2) return 0;
        for (int i = 0; i < l.length-2; i++) {
            for (int j = 1; j < l.length-1; j++) {
                if (i >= j || l[j] % l[i] != 0 || l[i] > l[j]) continue;
                for (int k = 2; k < l.length; k++) {
                    if (j < k && l[j] <= l[k] && l[k] % l[j] == 0) {
                        res += 1;
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        return res;
    }
}
