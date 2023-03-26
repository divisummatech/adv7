package javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        @Test
        void testAdd() {
            Calculator calculator = new Calculator();
            assertEquals(4, calculator.add(2, 2));
            assertEquals(-2, calculator.add(-1, -1));
            assertEquals(0, calculator.add(0, 0));
            assertEquals(5, calculator.add(2, 3));
        }

        @Test
        void testSubtract() {
            Calculator calculator = new Calculator();
            assertEquals(0, calculator.subtract(2, 2));
            assertEquals(2, calculator.subtract(4, 2));
            assertEquals(-1, calculator.subtract(2, 3));
            assertEquals(0, calculator.subtract(0, 0));
        }

    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        @Test
        void testMultiply() {
            Calculator calculator = new Calculator();
            assertEquals(4, calculator.multiply(2, 2));
            assertEquals(-2, calculator.multiply(-1, 2));
            assertEquals(0, calculator.multiply(0, 0));
            assertEquals(-6, calculator.multiply(2, -3));
        }

        @Test
        void testDivide() {
            Calculator calculator = new Calculator();
            assertEquals(2, calculator.divide(4, 2));
            assertEquals(-1, calculator.divide(2, -2));
            assertEquals(0, calculator.divide(0, 1));
            Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        }


        Calculator calculator = new Calculator();

    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
    }
}