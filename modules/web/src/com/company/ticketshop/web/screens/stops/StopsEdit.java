package com.company.ticketshop.web.screens.stops;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Stops;

@UiController("ticketshop_Stops.edit")
@UiDescriptor("stops-edit.xml")
@EditedEntityContainer("stopsDc")
@LoadDataBeforeShow
public class StopsEdit extends StandardEditor<Stops> {
}