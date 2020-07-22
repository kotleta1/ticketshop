package com.company.ticketshop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TICKETSHOP_STOPS")
@Entity(name = "ticketshop_Stops")
public class Stops extends StandardEntity {
    private static final long serialVersionUID = -5448821566105672508L;

    @Column(name = "STATIONS")
    protected String stations;

    public places getStations() {
        return stations == null ? null : places.fromId(stations);
    }

    public void setStations(places stations) {
        this.stations = stations == null ? null : stations.getId();
    }
}