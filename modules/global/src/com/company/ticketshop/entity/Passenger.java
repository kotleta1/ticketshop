package com.company.ticketshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|passengerid,fio")
@Table(name = "TICKETSHOP_PASSENGER")
@Entity(name = "ticketshop_Passenger")
public class Passenger extends StandardEntity {
    private static final long serialVersionUID = 3428906670634949242L;

    @NotNull
    @Column(name = "PASSENGERID", nullable = false, unique = true, length = 13)
    protected String passengerid;

    @NotNull
    @Column(name = "FIO", nullable = false, length = 50)
    protected String fio;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }
}