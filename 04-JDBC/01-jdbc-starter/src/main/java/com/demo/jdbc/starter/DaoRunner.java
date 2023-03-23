package com.demo.jdbc.starter;

import com.demo.jdbc.starter.dao.TicketDao;
import com.demo.jdbc.starter.dto.TicketFilter;
import com.demo.jdbc.starter.entity.Ticket;

import java.math.BigDecimal;
import java.util.Optional;

public class DaoRunner {
    public static void main(String[] args) {
//        updateTest();
//        filterTest();
        Optional<Ticket> ticket = TicketDao.getInstance().findById(5L);
        System.out.println(ticket);
    }

    private static void filterTest() {
        var ticketFilter = new TicketFilter(3, 0, "������� ���������", "A1");
        var tickets = TicketDao.getInstance().findAll(ticketFilter);
        System.out.println(tickets);
    }

    private static void updateTest() {
        var ticketDao = TicketDao.getInstance();
//        var deleteResult = ticketDao.delete(56L);
        Optional<Ticket> ticket = ticketDao.findById(2L);

        System.out.println(ticket);

        ticket.ifPresent(ticket1 -> {
            ticket1.setCost(BigDecimal.valueOf(188.88));
            ticketDao.update(ticket1);
        });
    }

    private static void saveTest() {
        var ticketDao = TicketDao.getInstance();
        var ticket = new Ticket();
        ticket.setPassengerNo("1234567");
        ticket.setPassengerName("Test");
//        ticket.setFlightId(3L);
        ticket.setSeatNo("B3");
        ticket.setCost(BigDecimal.TEN);

        var savedTicket = ticketDao.save(ticket);
        System.out.println(savedTicket);
    }
}
