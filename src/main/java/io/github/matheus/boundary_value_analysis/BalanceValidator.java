package io.github.matheus.boundary_value_analysis;

public class BalanceValidator {

    /**
     * Check if a balance is valid.
     *
     * @param balance the balance to be validated
     * @return true if the balance is valid, false otherwise
     */
    public static boolean isValid(int balance) {
        return balance >= -100 && balance <= 10000;
    }
}
