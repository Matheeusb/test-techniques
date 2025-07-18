package io.github.matheus.pairwise_testing;

import io.github.matheus.pairwise_testing.OrderOptionsValidator.CustomerType;
import io.github.matheus.pairwise_testing.OrderOptionsValidator.PaymentMethod;
import io.github.matheus.pairwise_testing.OrderOptionsValidator.ShippingMethod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Pairwise Testing
 * <p>
 * Without Pairwise Testing, the number of test cases would be higher = 27.
 * </p>
 *
 * <p>
 * With Pairwise Testing is used to ensure maximum coverage with minimal test cases = 9.
 * </p>
 */
public class OrderOptionsValidatorTest {

    @Test
    @DisplayName("Credit Card | Standard | Guest => Valid")
    void testCreditCardStandardGuestValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.CREDIT_CARD, ShippingMethod.STANDARD, CustomerType.GUEST));
    }

    @Test
    @DisplayName("Credit Card | Overnight | Returning => Valid")
    void testCreditCardOvernightReturningValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.CREDIT_CARD, ShippingMethod.OVERNIGHT, CustomerType.RETURNING));
    }

    @Test
    @DisplayName("Credit Card | Express | New => Valid")
    void testCreditCardExpressNewValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.CREDIT_CARD, ShippingMethod.EXPRESS, CustomerType.NEW));
    }

    @Test
    @DisplayName("PayPal | Overnight | Guest => Valid")
    void testPayPalOvernightGuestValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.PAYPAL, ShippingMethod.OVERNIGHT, CustomerType.GUEST));
    }

    @Test
    @DisplayName("PayPal | Standard | New => Valid")
    void testStandardNewValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.PAYPAL, ShippingMethod.STANDARD, CustomerType.NEW));
    }

    @Test
    @DisplayName("PayPal | Express | Returning => Valid")
    void testPayPalExpressReturningValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.PAYPAL, ShippingMethod.EXPRESS, CustomerType.RETURNING));
    }

    @Test
    @DisplayName("Bank Transfer | Overnight | Guest => Valid")
    void BankTransferOvernightGuestValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.BANK_TRANSFER, ShippingMethod.OVERNIGHT, CustomerType.GUEST));
    }

    @Test
    @DisplayName("Bank Transfer | Express | Returning => Valid")
    void testBankTransferExpressReturningValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.BANK_TRANSFER, ShippingMethod.EXPRESS, CustomerType.RETURNING));
    }

    @Test
    @DisplayName("Bank Transfer | Standard | New => Valid")
    void testBankTransferStandardNewValid() {
        assertTrue(OrderOptionsValidator.isValidOrder(
                PaymentMethod.BANK_TRANSFER, ShippingMethod.STANDARD, CustomerType.NEW));
    }
}
