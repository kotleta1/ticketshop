package com.company.ticketshop.web.screens.passenger;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Passenger;

@UiController("ticketshop_Passenger.browse")
@UiDescriptor("passenger-browse.xml")
@LookupComponent("passengersTable")
@LoadDataBeforeShow
public class PassengerBrowse extends StandardLookup<Passenger> {
}