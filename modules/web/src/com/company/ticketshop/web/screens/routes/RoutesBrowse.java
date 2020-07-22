package com.company.ticketshop.web.screens.routes;

import com.haulmont.cuba.gui.screen.*;
import com.company.ticketshop.entity.Routes;

@UiController("ticketshop_Routes.browse")
@UiDescriptor("routes-browse.xml")
@LookupComponent("routesesTable")
@LoadDataBeforeShow
public class RoutesBrowse extends StandardLookup<Routes> {
}