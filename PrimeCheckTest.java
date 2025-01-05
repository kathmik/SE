import org.junit.Assert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeCheckTest {
    // --------------------------------------------------------------- //
    @Test
    public void TestNegativeNumbers() {
        for (int i = -10; i < 0; ++i) {
            assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
        }
    }

    // --------------------------------------------------------------- //
    @Test
    public void TestEdgeCases() {
        assertEquals("Test 0", false, PrimeCheck.isPrime(0));
        assertEquals("Test 1", false, PrimeCheck.isPrime(1));
        assertEquals("Test 2", true, PrimeCheck.isPrime(2));
    }

    // --------------------------------------------------------------- //
    @Test
    public void testPrimes() {
        /* ToDo: insert a test here */
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        for (int i = 0; i<=primeNumbers.length; i++){
            assertEquals("Number at position " + i + " is a prime number", true, PrimeCheck.isPrime(primeNumbers[i]));
        }
    }

    // --------------------------------------------------------------- //
    @Test
    public void testNonPrimes() {
        /* ToDo: insert a test here */
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        for(int i: primeNumbers){
            for (int x = 2; i*x < 50; x++) {
                assertEquals("Number " + i*x + " is not a prime number", false, PrimeCheck.isPrime(i*x));
            }
        }
    }
}
