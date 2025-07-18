package io.github.matheus.cause_effect_graphing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Cause-Effect Graphing
 * <p>
 * C1: user is a premium member
 * C2: a coupon is available
 * E1: 15% discount
 * E2: 10% discount
 * E3: 5% discount
 * E4: 0% discount
 * <p>
 * C1 AND C2 -> E1
 * C1 -> E2
 * C2 -> E3
 * !C1 AND !C2 -> E4
 * <p>
 * | C1 | C2 | E1 | E2 | E3 | E4 |
 * |----|----|----|----|----|----|
 * | 1  | 1  | 1  | 0  | 0  | 0  |
 * | 1  | 0  | 0  | 1  | 0  | 0  |
 * | 0  | 1  | 0  | 0  | 1  | 0  |
 * | 0  | 0  | 0  | 0  | 0  | 1  |
 */
class CalculatorTest {

    @Test
    @DisplayName("Should return 15 when isPremium is true and coupon is true")
    void testDiscount15() {
        assertEquals(15, Calculator.calculateDiscount(true, true));
    }

    @Test
    @DisplayName("Should return 10 when isPremium is true and coupon is false")
    void testDiscount10() {
        assertEquals(10, Calculator.calculateDiscount(true, false));
    }

    @Test
    @DisplayName("Should return 5 when isPremium is false and coupon is true")
    void testDiscount5() {
        assertEquals(5, Calculator.calculateDiscount(false, true));
    }

    @Test
    @DisplayName("Should return 0 when isPremium is false and coupon is false")
    void testDiscount0() {
        assertEquals(0, Calculator.calculateDiscount(false, false));
    }
}
