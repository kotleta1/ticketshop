package com.company.ticketshop.entity;


import com.haulmont.chile.core.datatypes.impl.EnumClass;
import jdk.internal.jline.internal.Nullable;

public enum places implements EnumClass<String> {
    PARIS("PARIS"),
    SAMARA("SAMARA"),
    MOSCOW("MOSCOW"),
    OREL("OREL"),
    SOCHI("SOCHI"),
    LONDON("LONDON");
    private String id;

    places(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static places fromId(String id) {
        for (places at : places.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}






