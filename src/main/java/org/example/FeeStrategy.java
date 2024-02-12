package org.example;

public interface FeeStrategy {
    double calculate(Visitor visitor, TicketType ticketType, double fee);
}
