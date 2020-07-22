package com.company.ticketshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@NamePattern("%s|ticketid")
@Table(name = "TICKETSHOP_TICKET")
@Entity(name = "ticketshop_Ticket")
public class Ticket extends StandardEntity {
    private static final long serialVersionUID = -4081770758165638816L;

    @NotNull
    @Column(name = "TICKETID", nullable = false, unique = true)
    protected String ticketid;

    @Column(name = "VEHTYPE")
    protected String vehtype;

    @Column(name = "PRICE")
    protected Double price;

    @Temporal(TemporalType.DATE)
    @Column(name = "DEPARTURETIME")
    protected Date departuretime;

    @Temporal(TemporalType.DATE)
    @Column(name = "ARRIVALTIME")
    protected Date arrivaltime;

    @Column(name = "ARRIVALPLACE")
    protected String arrivalplace;

    @Column(name = "DEPARTUREPLACE")
    protected String departureplace;

    public String getTicketid() {
        return ticketid;
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    public Vehicles getVehtype() {
        return vehtype == null ? null : Vehicles.fromId(vehtype);
    }

    public void setVehtype(Vehicles vehtype) {
        this.vehtype = vehtype == null ? null : vehtype.getId();
    }

    public void setArrivalplace(places arrivalplace) {
        this.arrivalplace = arrivalplace == null ? null : arrivalplace.getId();
    }

    public places getArrivalplace() {
        return arrivalplace == null ? null : places.fromId(arrivalplace);
    }

    public void setDepartureplace(places departureplace) {
        this.departureplace = departureplace == null ? null : departureplace.getId();
    }

    public places getDepartureplace() {
        return departureplace == null ? null : places.fromId(departureplace);
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}