package io.github.matheus.cause_effect_graphing;

public class Calculator {

    /**
     * Calculates the discount based on the user's profile and if a coupon is available.
     *
     * @param isPremium if the user is a premium member. 10% discount
     * @param coupon    if a coupon is available. 5% discount
     * @return the discount percentage
     */
    public static int calculateDiscount(boolean isPremium, boolean coupon) {
        if (isPremium && coupon) return 15;
        if (isPremium) return 10;
        if (coupon) return 5;
        else return 0;
    }
}
