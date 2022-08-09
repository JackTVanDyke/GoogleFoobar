import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test0() {
        assertEquals("9", Solution.solution(3,2));
    }
    @Test
    void test1() {
        assertEquals("13", Solution.solution(3,3));
    }
    @Test
    void test2() {
        assertEquals("96", Solution.solution(5,10));
    }
    @Test
    void test3() {
        assertEquals("1", Solution.solution(1,1));
    }
}