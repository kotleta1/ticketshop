package com.company.ticketshop.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TICKETSHOP_ROUTES")
@Entity(name = "ticketshop_Routes")
public class Routes extends StandardEntity {
    private static final long serialVersionUID = 112056878499775489L;

    @NotNull
    @Column(name = "ROUTEID", nullable = false, unique = true)
    protected Long routeid;

    @Column(name = "VEHTYPE")
    protected String vehtype;

    public Vehicles getVehtype() {
        return vehtype == null ? null : Vehicles.fromId(vehtype);
    }

    public void setVehtype(Vehicles vehtype) {
        this.vehtype = vehtype == null ? null : vehtype.getId();
    }

    public Long getRouteid() {
        return routeid;
    }

    public void setRouteid(Long routeid) {
        this.routeid = routeid;
    }
}