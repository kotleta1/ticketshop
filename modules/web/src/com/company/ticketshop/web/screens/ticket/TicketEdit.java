package com.company.ticketshop.web.screens.ticket;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Ticket;

@UiController("ticketshop_Ticket.edit")
@UiDescriptor("ticket-edit.xml")
@EditedEntityContainer("ticketDc")
@LoadDataBeforeShow
public class TicketEdit extends StandardEditor<Ticket> {
}