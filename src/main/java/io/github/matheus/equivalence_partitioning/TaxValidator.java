package io.github.matheus.equivalence_partitioning;

public class TaxValidator {

    /**
     * Calculate the tax based on the amount.
     *
     * @param amount the amount to calculate the tax
     * @return the tax percentage
     */
    public static int calculateTax(double amount) {
        if (amount <= 500) return 0;
        else if (amount <= 1000) return 5;
        else if (amount <= 2000) return 7;
        else return 10;
    }
}
