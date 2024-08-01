package io.github.matheus.equivalence_partitioning;

public class AgeValidator {

    /**
     * Check if the age is valid.
     *
     * @param age the age to be validated
     * @return true if the age is valid, false otherwise
     */
    public static boolean isAgeValid(int age) {
        return age >= 18 && age <= 120;
    }
}
