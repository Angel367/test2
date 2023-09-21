package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticTest {

    @Test
    void testCalculateWithRealRoots() {
        Quadratic quadratic = new Quadratic();
        assertEquals(2, quadratic.calculate(1, -3, 2).size());
    }

    @Test
    void testCalculateWithOneRealRoot() {
        Quadratic quadratic = new Quadratic();
        assertEquals(1, quadratic.calculate(1, -4, 4).size());
    }

    @Test
    void testCalculateWithComplexRoots() {
        Quadratic quadratic = new Quadratic();
        assertTrue(quadratic.calculate(1, 2, 5).isEmpty());
    }

}
