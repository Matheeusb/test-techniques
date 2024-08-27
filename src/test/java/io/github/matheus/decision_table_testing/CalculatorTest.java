package io.github.matheus.decision_table_testing;

import io.github.matheus.cause_effect_graphing.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Decision Table Testing
 * <p>
 * Condition         | Rule 1  | Rule 2  | Rule 3  | Rule 4  |
 * ------------------|---------|---------|---------|---------|
 * User is premium   |    0    |    0    |    1    |    1    |
 * Coupon available  |    0    |    1    |    0    |    1    |
 * ------------------|---------|---------|---------|---------|
 * Result            |   0%    |    5%   |   10%   |   15%   |
 */
class CalculatorTest {

    @Test
    @DisplayName("Should return 15 when isPremium is true and coupon is true")
    void testDiscount15() {
        assertEquals(Calculator.calculateDiscount(true, true), 15);
    }

    @Test
    @DisplayName("Should return 10 when isPremium is true and coupon is false")
    void testDiscount10() {
        assertEquals(Calculator.calculateDiscount(true, false), 10);
    }

    @Test
    @DisplayName("Should return 5 when isPremium is false and coupon is true")
    void testDiscount5() {
        assertEquals(Calculator.calculateDiscount(false, true), 5);
    }

    @Test
    @DisplayName("Should return 0 when isPremium is false and coupon is false")
    void testDiscount0() {
        assertEquals(Calculator.calculateDiscount(false, false), 0);
    }
}
