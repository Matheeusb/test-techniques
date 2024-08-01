package io.github.matheus.boundary_value_analysis;

public class ScoreValidator {

    /**
     * Check if a score is valid.
     *
     * @param score the score to be validated
     * @return true if the score is valid, false otherwise
     */
    public static boolean isValid(double score) {
        return score >= 0.0 && score <= 10.0;
    }
}
