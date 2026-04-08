package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Ticketcontroller {

    @Autowired
    private Ticketservice ticketservice;

    // SHOW FORM (CREATE)
    @GetMapping("/ticket")
    public String showTicketForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "ticket-form";
    }

    // SAVE (CREATE + UPDATE)
    @PostMapping("/ticket/save")
    public String saveTicket(@ModelAttribute Ticket ticket) {
        ticketservice.saveTicket(ticket);
        return "redirect:/ticket/list";
    }

    // LIST
    @GetMapping("/ticket/list")
    public String listTickets(Model model) {
        model.addAttribute("tickets", ticketservice.getAllTickets());
        return "ticket-list";
    }

    // EDIT (UPDATE)
    @GetMapping("/ticket/edit/{id}")
    public String editTicket(@PathVariable Integer id, Model model) {
        Ticket ticket = ticketservice.getTicketById(id);
        model.addAttribute("ticket", ticket);
        return "ticket-form";
    }

    // DELETE ONE
    @GetMapping("/ticket/delete/{id}")
    public String deleteTicket(@PathVariable Integer id) {
        ticketservice.deleteTicket(id);
        return "redirect:/ticket/list";
    }

    // TRUNCATE (DELETE ALL)
    @GetMapping("/ticket/deleteAll")
    public String deleteAllTickets() {
        ticketservice.deleteAllTickets();
        return "redirect:/ticket/list";
    }
}
