-- update TICKETSHOP_TICKET set TICKETID = <default_value> where TICKETID is null ;
alter table TICKETSHOP_TICKET alter column TICKETID set not null ;
