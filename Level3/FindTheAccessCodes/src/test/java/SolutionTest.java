import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test0() {
        assertEquals(1, Solution.solution(new int[]{999999, 999999, 999999}));
    }
    @Test
    void test1() {
        assertEquals(3, Solution.solution(new int[]{1,2,3,4,5,6}));
    }
    @Test
    void test2() {
        assertEquals(4, Solution.solution(new int[]{1,1,1,1}));
    }
    @Test
    void test3() {
        assertEquals(22, Solution.solution(new int[]{1, 1, 1, 2, 3, 4, 6}));
    }
    @Test
    void test4() {
        assertEquals(0, Solution.solution(new int[]{5, 7, 12}));
    }

}