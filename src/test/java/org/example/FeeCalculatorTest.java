package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeeCalculatorTest {
    @Test
    public void testCalculateFee_AdultHalfDay() {
        Visitor adultVisitor = new Visitor();
        double fee = FeeCalculator.calculateFee(adultVisitor, TicketType.HALF_DAY);
        assertEquals(20.0, fee, 0.01);
    }

    @Test
    public void testCalculateFee_AdultFullDay() {
        Visitor adultVisitor = new Visitor();
        double fee = FeeCalculator.calculateFee(adultVisitor, TicketType.FULL_DAY);
        assertEquals(50.0, fee, 0.01);
    }

    @Test
    public void testCalculateFee_ChildHalfDay() {
        Visitor childVisitor = new Visitor();
        double fee = FeeCalculator.calculateFee(childVisitor, TicketType.HALF_DAY);
        assertEquals(20.0, fee, 0.01);
    }

    @Test
    public void testCalculateFee_ChildFullDay() {
        Visitor childVisitor = new Visitor();
        double fee = FeeCalculator.calculateFee(childVisitor, TicketType.FULL_DAY);
        assertEquals(50.0, fee, 0.01);
    }

}