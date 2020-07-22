package com.company.ticketshop.web.screens.trip;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Trip;

@UiController("ticketshop_Trip.browse")
@UiDescriptor("trip-browse.xml")
@LookupComponent("tripsTable")
@LoadDataBeforeShow
public class TripBrowse extends StandardLookup<Trip> {
}