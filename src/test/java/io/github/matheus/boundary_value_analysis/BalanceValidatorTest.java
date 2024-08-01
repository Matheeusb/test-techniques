package io.github.matheus.boundary_value_analysis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Boundary Value Analysis
 * <p>
 *   |                  |
 * __|   |__________|   |____
 * -100 -100       10000 10001
 * <p>
 * | Input | Output |
 * |-------|--------|
 * | -101  | false  |
 * | -100  | true   |
 * | 10000 | true   |
 * | 10001 | false  |
 */
class BalanceValidatorTest {

    @Test
    @DisplayName("Should return false when balance is -101")
    void testIsInvalidNegative() {
        assertFalse(BalanceValidator.isValid(-101));
    }

    @Test
    @DisplayName("Should return true when balance is -100")
    void testIsValidNegative() {
        assertTrue(BalanceValidator.isValid(-100));
    }

    @Test
    @DisplayName("Should return true when balance is 10000")
    void testIsValidPositive() {
        assertTrue(BalanceValidator.isValid(10000));
    }

    @Test
    @DisplayName("Should return false when balance is 10001")
    void testIsInvalidPositive() {
        assertFalse(BalanceValidator.isValid(10001));
    }
}
