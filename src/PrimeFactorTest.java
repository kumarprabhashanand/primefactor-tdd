import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorTest {

    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void checkPrimeFactorsOfNumbers() {
        assertEquals(emptyList(), primeFactor.getPrimeFactors(1));
        assertEquals(Arrays.asList(2), primeFactor.getPrimeFactors(2), "Prime Factors of 2");
        assertEquals(Arrays.asList(3), primeFactor.getPrimeFactors(3));
        assertEquals(Arrays.asList(2,2), primeFactor.getPrimeFactors(4));
        assertEquals(Arrays.asList(3,3), primeFactor.getPrimeFactors(9));
        assertEquals(Arrays.asList(2,2,2), primeFactor.getPrimeFactors(8));
    }


}