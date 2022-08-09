import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test0() {
        assertEquals(5, Solution.solution("15"));
    }
    @Test
    void test1() {
        assertEquals(2, Solution.solution("4"));
    }
    @Test
    void test2() {
        assertEquals(5, Solution.solution("13"));
    }
    @Test
    void test3() {
        assertEquals(6, Solution.solution("25"));
    }
    @Test
    void test4() {
        assertEquals(7, Solution.solution("47"));
    }


}