package com.company.ticketshop.web.screens.routes;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Routes;

@UiController("ticketshop_Routes.edit")
@UiDescriptor("routes-edit.xml")
@EditedEntityContainer("routesDc")
@LoadDataBeforeShow
public class RoutesEdit extends StandardEditor<Routes> {
}