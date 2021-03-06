-- begin TICKETSHOP_PASSENGER
create unique index IDX_TICKETSHOP_PASSENGER_UNIQ_PASSENGERID on TICKETSHOP_PASSENGER (PASSENGERID) ^
-- end TICKETSHOP_PASSENGER
-- begin TICKETSHOP_ROUTES
create unique index IDX_TICKETSHOP_ROUTES_UNIQ_ROUTEID on TICKETSHOP_ROUTES (ROUTEID) ^
-- end TICKETSHOP_ROUTES
-- begin TICKETSHOP_TICKET
create unique index IDX_TICKETSHOP_TICKET_UNIQ_TICKETID on TICKETSHOP_TICKET (TICKETID) ^
-- end TICKETSHOP_TICKET
-- begin TICKETSHOP_TRIP
alter table TICKETSHOP_TRIP add constraint FK_TICKETSHOP_TRIP_ON_PASSENGERID foreign key (PASSENGERID_ID) references TICKETSHOP_PASSENGER(ID)^
alter table TICKETSHOP_TRIP add constraint FK_TICKETSHOP_TRIP_ON_TICKETID foreign key (TICKETID_ID) references TICKETSHOP_TICKET(ID)^
create index IDX_TICKETSHOP_TRIP_ON_PASSENGERID on TICKETSHOP_TRIP (PASSENGERID_ID)^
create index IDX_TICKETSHOP_TRIP_ON_TICKETID on TICKETSHOP_TRIP (TICKETID_ID)^
-- end TICKETSHOP_TRIP
-- begin TICKETSHOP_STOPS
alter table TICKETSHOP_STOPS add constraint FK_TICKETSHOP_STOPS_ON_ROUTEID foreign key (ROUTEID_ID) references TICKETSHOP_ROUTES(ID)^
create index IDX_TICKETSHOP_STOPS_ON_ROUTEID on TICKETSHOP_STOPS (ROUTEID_ID)^
-- end TICKETSHOP_STOPS
