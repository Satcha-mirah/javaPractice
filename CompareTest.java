package tddPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareTest{
    Compare compare;
    @BeforeEach
    void beforeAllTestMethods(){
        compare = new Compare();

    }
    @Test
   void testThatUserCanInputIntegers(){
        assertEquals(10, compare.enterOneInteger(10));
    }
    @Test
    void squareOfNumber(){
        assertEquals(25, compare.getSquaredNumber(5));
    }
    @Test
    void testThatUserInputIsGreaterThan100(){
        assertEquals(true, compare.inputGreaterNumbers(110));
    }
    @Test
    void testThatUserInputIsLessThan100(){
        assertEquals(false,compare.inputGreaterNumbers(50));
    }
    @Test
    void testThatUserInputIsEqualTo100(){
        assertEquals(true,compare.inputEqualNumbers(100));
    }
    @Test
    void testThatUserInputIsNotEqualTo100(){
        assertEquals(false, compare.inputEqualNumbers(70));
    }
    @Test
    void testThatSqrIsGreaterThan100(){
        assertEquals(true, compare.sqrGreaterThan100(11));
    }
    @Test
    void testThatSqrIsLessThan100(){
        assertEquals(false, compare.sqrGreaterThan100(5));
    }
    @Test
    void testThatSqrIsEqualTo100(){
        assertEquals(true, compare.sqrEqualNumber(10));
    }
    @Test
    void testThatSqrIsNotEqualTo100(){
        assertEquals(false, compare.sqrEqualNumber(6));
    }

}