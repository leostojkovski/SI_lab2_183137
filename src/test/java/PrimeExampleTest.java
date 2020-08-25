import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeExampleTest {

    @Test
    void EachStatementTests(){
        assertAll(
                () -> assertFalse(PrimeExample.checkPrime(1)),
                () -> assertFalse(PrimeExample.checkPrime(0)),
                () -> assertFalse(PrimeExample.checkPrime(4)),
                () -> assertTrue(PrimeExample.checkPrime(2)),
                () -> assertTrue(PrimeExample.checkPrime(3))
        );
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void shouldThrowRuntimeException() throws Exception {
        expectedEx.expect(RuntimeException.class);
        expectedEx.expectMessage("Number should not be negative");
        PrimeExample.checkPrime(-1);
    }

    @Test
    void EachPathTests(){
        assertAll(
                () -> assertFalse(PrimeExample.checkPrime(1)),
                () -> assertFalse(PrimeExample.checkPrime(0)),
                () -> assertFalse(PrimeExample.checkPrime(8)),
                () -> assertTrue(PrimeExample.checkPrime(7)),
                () -> assertTrue(PrimeExample.checkPrime(11))
        );
    }

}
