package tddPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SmallAndLargeArithmeticTest {
    SmallAndLargeArithmetic smallAndLargeArithmetic;

    @BeforeEach
    void beforeAllTestMethods(){
        smallAndLargeArithmetic = new SmallAndLargeArithmetic();
    }
    @Test
    void testSumOfThreeNumbers(){
        assertEquals(10, smallAndLargeArithmetic.sumThreeNumbers(3,5,2));

    }
    @Test
    void testProductOfThreeNumbers(){
        assertEquals(60, smallAndLargeArithmetic.multiplyThreeNumbers(3,5,4));
    }
    @Test
    void testAverageOfThreeNumbers(){
        assertEquals(3, smallAndLargeArithmetic.divideThreeNumbers(10,3,2));
    }
    @Test
    void testTheSmallestOfThreeNumbers(){
        assertEquals(10, smallAndLargeArithmetic.smallestOfThreeNumbers(10,25,15));
    }
    @Test
    void testTheLargestOfThreeNumbers(){
        assertEquals(200,smallAndLargeArithmetic.largestOfThreeNumbers(200,20,100));
    }
}
