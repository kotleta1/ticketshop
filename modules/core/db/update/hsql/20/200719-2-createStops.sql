alter table TICKETSHOP_STOPS add constraint FK_TICKETSHOP_STOPS_ON_ROUTES foreign key (ROUTES_ID) references TICKETSHOP_ROUTES(ID);
create index IDX_TICKETSHOP_STOPS_ON_ROUTES on TICKETSHOP_STOPS (ROUTES_ID);
