package io.github.matheus.pairwise_testing;

public class OrderOptionsValidator {

    public enum PaymentMethod {
        CREDIT_CARD, PAYPAL, BANK_TRANSFER
    }

    public enum ShippingMethod {
        STANDARD, EXPRESS, OVERNIGHT
    }

    public enum CustomerType {
        NEW, RETURNING, GUEST
    }

    /**
     * Validates the order options based on the selected payment method.
     *
     * @param paymentMethod  the selected payment method
     * @param shippingMethod the selected shipping method
     * @param customerType   the type of customer
     * @return true
     */
    public static boolean isValidOrder(PaymentMethod paymentMethod,
                                             ShippingMethod shippingMethod,
                                             CustomerType customerType) {
        return true;
    }
}
