package tddPractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    Arithmetic arithmetic;

    @BeforeEach
    void beforeAllTestMethods(){
        arithmetic = new Arithmetic();
    }

    @Test
    void testThatUserCanInputNumbers(){
        assertEquals(8,arithmetic.collectInputFromUser(5,3) );
    }
    @Test
    void squareOfNumber1(){
        assertEquals(36, arithmetic.getSquaredNumber1(6));
    }
    @Test
    void squareOfNumber2(){
        assertEquals(36, arithmetic.getSquaredNumber2(6));
    }
    @Test
    void sumOfSquares(){
        assertEquals(13, arithmetic.squaredNumberSum(2,3));
    }

@Test
    void differenceOfSquares(){
        assertEquals(27, arithmetic.squaredNumberDifference(6,3));
}


}