package com.company.ticketshop.entity;


import com.haulmont.chile.core.datatypes.impl.EnumClass;
import jdk.internal.jline.internal.Nullable;

public enum Vehicles implements EnumClass<String> {
    BUS("BUS"),
    PLANE("PLANE"),
    TRAIN("TRAIN");

    private String id;

    Vehicles(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Vehicles fromId(String id) {
        for (Vehicles at : Vehicles.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}






