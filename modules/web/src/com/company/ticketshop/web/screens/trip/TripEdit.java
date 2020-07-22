package com.company.ticketshop.web.screens.trip;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Trip;

@UiController("ticketshop_Trip.edit")
@UiDescriptor("trip-edit.xml")
@EditedEntityContainer("tripDc")
@LoadDataBeforeShow
public class TripEdit extends StandardEditor<Trip> {
}