package com.company.ticketshop.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Ticket;

@UiController("ticketshop_Ticket.browse")
@UiDescriptor("ticket-browse.xml")
@LookupComponent("ticketsTable")
@LoadDataBeforeShow
public class TicketBrowse extends StandardLookup<Ticket> {
}