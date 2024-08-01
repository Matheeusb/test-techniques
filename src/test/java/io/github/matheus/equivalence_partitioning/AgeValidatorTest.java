package io.github.matheus.equivalence_partitioning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Equivalence Partitioning
 * <p>
 * EP1: age < 18
 * EP2: 18 <= age <= 120
 * EP3: age > 120
 * <p>
 * | Input | Output |
 * |-------|--------|
 * | 17    | false  |
 * | 50    | true   |
 * | 121   | false  |
 */
class AgeValidatorTest {

    @Test
    @DisplayName("Should return false when age is less than 18")
    void testIsAgeLessThan18() {
        assertFalse(AgeValidator.isAgeValid(17));
    }

    @Test
    @DisplayName("Should return true when age between 18 and 120")
    void testIsAgeBetween18And120() {
        assertTrue(AgeValidator.isAgeValid(50));
    }

    @Test
    @DisplayName("Should return false when age is greater than 120")
    void testIsAgeGreaterThan120() {
        assertFalse(AgeValidator.isAgeValid(121));
    }
}
