import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test0() {
        assertEquals(4, Solution.solution("abcabcabcabc"));
    }
    @Test
    void test1() {
        assertEquals(2, Solution.solution("abccbaabccba"));
    }
    @Test
    void test2() {
        assertEquals(1, Solution.solution("abcdefgh"));
    }
    @Test
    void test3() {
        assertEquals(5, Solution.solution("bbbbb"));
    }
}