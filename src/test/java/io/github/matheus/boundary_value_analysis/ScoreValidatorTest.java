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
 * -0.1 0.0       10.0 10.1
 * <p>
 * | Input | Output |
 * |-------|--------|
 * | -0.1  | false  |
 * | 0.0   | true   |
 * | 10.0  | true   |
 * | 10.1  | false  |
 */
class ScoreValidatorTest {

    @Test
    @DisplayName("Should return false when score is -0.1")
    void testIsInvalidNegative() {
        assertFalse(ScoreValidator.isValid(-0.1));
    }

    @Test
    @DisplayName("Should return true when score is 0.0")
    void testIsValidZero() {
        assertTrue(ScoreValidator.isValid(0.0));
    }

    @Test
    @DisplayName("Should return true when score is 10.0")
    void testIsValidTen() {
        assertTrue(ScoreValidator.isValid(10.0));
    }

    @Test
    @DisplayName("Should return false when score is 10.1")
    void testIsInvalidPositive() {
        assertFalse(ScoreValidator.isValid(10.1));
    }

}
