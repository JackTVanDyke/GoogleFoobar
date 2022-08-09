import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test0() {
        assertEquals(new int[]{21,15,29}, Solution.solution(5, new int[]{19, 14, 28}));
    }
    @Test
    void test1() {
        assertEquals(new int[]{-1,7,6,3}, Solution.solution(3, new int[]{7, 3, 5, 1}));
    }
    @Test
    void test2() {
        assertEquals(new int[]{3,6,-1}, Solution.solution(3, new int[]{1,4,7}));
    }
}