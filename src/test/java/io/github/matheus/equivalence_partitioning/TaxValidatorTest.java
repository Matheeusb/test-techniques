package io.github.matheus.equivalence_partitioning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Equivalence Partitioning
 * <p>
 * EP1: amount <= 500
 * EP2: 500 < amount <= 1000
 * EP3: 1000 < amount <= 2000
 * EP4: amount > 2000
 * <p>
 * | Input  | Output |
 * |--------|--------|
 * | 300    | 0      |
 * | 750    | 5      |
 * | 1500   | 7      |
 * | 2500   | 10     |
 */

class TaxValidatorTest {

    @Test
    @DisplayName("Should return 0 when amount is less than or equal to 500")
    void testTaxLessThan500() {
        assertEquals(TaxValidator.calculateTax(300), 0);
    }

    @Test
    @DisplayName("Should return 5 when amount is between 500 and 1000")
    void testTaxBetween500And1000() {
        assertEquals(TaxValidator.calculateTax(750), 5);
    }

    @Test
    @DisplayName("Should return 7 when amount is between 1000 and 2000")
    void testTaxBetween1000And2000() {
        assertEquals(TaxValidator.calculateTax(1500), 7);
    }

    @Test
    @DisplayName("Should return 10 when amount is greater than 2000")
    void testTaxGreaterThan2000() {
        assertEquals(TaxValidator.calculateTax(2500), 10);
    }
}
