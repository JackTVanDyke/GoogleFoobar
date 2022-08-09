// INSTRUCTIONS //
//Oh no! Commander Lambda's latest experiment to improve the efficiency of the LAMBCHOP doomsday device has backfired spectacularly.
//The Commander had been improving the structure of the ion flux converter tree, but something went terribly wrong and the flux chains exploded.
//Some of the ion flux converters survived the explosion intact, but others had their position labels blasted off.
//Commander Lambda is having her henchmen rebuild the ion flux converter tree by hand, but you think you can do it much more quickly.
//Flux chains require perfect binary trees, so Lambda's design arranged the ion flux converters to form one.
//To label them, Lambda performed a post-order traversal of the tree of converters and labeled each converter with the order of that converter in the traversal, starting at 1.
//For example, a tree of 7 converters would look like the following:
//   7
// 3   6
//1 2 4 5
//Write a function solution(h, q) - where h is the height of the perfect tree of converters and q is a list of positive integers representing different flux converters
//- which returns a list of integers p where each element in p is the label of the converter that sits on top of the respective converter in q, or -1 if there is no such converter.
//For example, solution(3, [1, 4, 7]) would return the converters above the converters at indexes 1, 4, and 7 in a perfect binary tree of height 3, which is [3, 6, -1].
//The domain of the integer h is 1 <= h <= 30, where h = 1 represents a perfect binary tree containing only the root,
//h = 2 represents a perfect binary tree with the root and two leaf nodes,
//h = 3 represents a perfect binary tree with the root, two internal nodes and four leaf nodes (like the example above), and so forth.
//The lists q and p contain at least one but no more than 10000 distinct integers, all of which will be between 1 and 2^h-1, inclusive.

import java.util.Arrays;

public class Solution {
    public static int search(int head, int target, int under) {
        under /= 2;                      // tree level under
        int right = head - 1;			// right = head - 1
        int left = head - 1 - under--; // left = head - 1 - under/2
        if (right == target || left == target)
            return head;
        else {
            if (target <= left)
                return search(left,target,under);
            else
                return search(right,target,under);
        }
    }
    public static int[] solution(int h, int[] q) {
        int height = (int)Math.pow(2,h) - 1;
        int[] res = new int[q.length];
        for (int i = 0 ; i < q.length ; i++) {
            if (q[i] < height && q[i] >=1)
                res[i] = search(height,q[i],height-1);
            else
                res[i] = -1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{1, 4, 7})));
        System.out.println(Arrays.toString(solution(5, new int[]{19, 14, 28})));
        System.out.println(Arrays.toString(solution(4, new int[]{7, 3, 5, 11})));
    }

}
