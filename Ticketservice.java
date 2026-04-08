package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ticketservice {

    @Autowired
    private Ticketdao ticketdao;

    // CREATE + UPDATE
    public Ticket saveTicket(Ticket ticket) {
        return ticketdao.save(ticket);
    }

    // READ ALL
    public Iterable<Ticket> getAllTickets() {
        return ticketdao.findAll();
    }

    // READ BY ID (for update)
    public Ticket getTicketById(Integer ticketid) {
        return ticketdao.findById(ticketid).orElse(null);
    }

    // DELETE ONE
    public void deleteTicket(Integer ticketid) {
        ticketdao.deleteById(ticketid);
    }

    // TRUNCATE (DELETE ALL)
    public void deleteAllTickets() {
        ticketdao.deleteAll();
    }
}
