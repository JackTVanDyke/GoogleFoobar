public class Solution {
    // CONSTRAINTS //
    //Your code will be compiled using standard Java 8. All tests will be run by calling the solution() method inside the Solution class
    //Execution time is limited.
    //Wildcard imports and some specific classes are restricted (e.g. java.lang.ClassLoader). You will receive an error when you verify your solution if you have used a blacklisted class.
    //Third-party libraries, input/output operations, spawning threads or processes and changes to the execution environment are not allowed.
    //Your solution must be under 32000 characters in length including new lines and and other non-printing characters.

    // INSTRUCTIONS //
    //Commander Lambda has had an incredibly successful week: the first test of the LAMBCHOP doomsday device was completed AND Lambda set a new personal high score in Tetris.
    //To celebrate, the Commander ordered cake for everyone -- even the lowliest of minions! But competition among minions is fierce,
    //and if you don't cut exactly equal slices of cake for everyone you'll get in big trouble.
    //The cake is round, and decorated with M&Ms in a circle around the edge. But while the rest of the cake is uniform, the M&Ms are not: there are multiple colors,
    //and every minion must get exactly the same sequence of M&Ms. Commander Lambda hates waste and will not tolerate any leftovers, so you also want to make sure you can serve the entire cake.
    //To help you best cut the cake, you have turned the sequence of colors of the M&Ms on the cake into a string: each possible letter (between a and z) corresponds to a unique color,
    //and the sequence of M&Ms is given clockwise (the decorations form a circle around the outer edge of the cake).
    //Write a function called solution(s) that, given a non-empty string less than 200 characters in length describing the sequence of M&Ms,
    //returns the maximum number of equal parts that can be cut from the cake without leaving any leftovers.
    public static void main(String[] args) {
        System.out.println(solution("abccbaabccba"));
    }
    public static int solution(String x) {
        if (x.length() == 1) return 1;
        char[] ch = x.toCharArray();
        String sub = "";
        for (int i = 0; i < ch.length; i++) {
            sub += ch[i];
            String[] arrStr = x.split(sub);
            if (arrStr.length == 0) {
                return x.length()/sub.length();
            }
        }
        return 1;
    }
}
