import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test0() {
        assertEquals("1", Solution.solution("2","1"));
    }
    @Test
    void test1() {
        assertEquals("4", Solution.solution("4","7"));
    }
    @Test
    void test2() {
        assertEquals("3", Solution.solution("2","5"));
    }
    @Test
    void test3() {
        assertEquals("impossible", Solution.solution("2","4"));
    }
    @Test
    void test4() {
        assertEquals("10", Solution.solution("31","4"));
    }
    @Test
    void test5() {
        assertEquals("0", Solution.solution("1","1"));
    }

}