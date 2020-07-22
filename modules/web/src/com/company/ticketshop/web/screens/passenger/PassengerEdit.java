package com.company.ticketshop.web.screens.passenger;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Passenger;

@UiController("ticketshop_Passenger.edit")
@UiDescriptor("passenger-edit.xml")
@EditedEntityContainer("passengerDc")
@LoadDataBeforeShow
public class PassengerEdit extends StandardEditor<Passenger> {
}