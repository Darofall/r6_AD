package org.example;

public class AdultFeeStrategy {
    private static final double ADULT_PRICE_BASE = 100;

    static double calculateAdultFee(Visitor visitor, TicketType ticketType, double fee) {
        // calculate price for adults
        if ((visitor.getAge() > 14) && (TicketType.HALF_DAY == ticketType)) {
            fee = ADULT_PRICE_BASE * 0.6;
        } else if ((visitor.getAge() > 14) && (TicketType.FULL_DAY == ticketType)) {
            fee = ADULT_PRICE_BASE * 1.2;
        }
        return fee;
    }
}