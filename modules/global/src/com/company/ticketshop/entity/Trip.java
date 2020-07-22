package com.company.ticketshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s %s|ticketid,passengerid")
@Table(name = "TICKETSHOP_TRIP")
@Entity(name = "ticketshop_Trip")
public class Trip extends StandardEntity {
    private static final long serialVersionUID = -3755302437011507790L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PASSENGERID_ID")
    protected Passenger passengerid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TICKETID_ID")
    protected Ticket ticketid;

    public Ticket getTicketid() {
        return ticketid;
    }

    public void setTicketid(Ticket ticketid) {
        this.ticketid = ticketid;
    }

    public Passenger getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(Passenger passengerid) {
        this.passengerid = passengerid;
    }
}