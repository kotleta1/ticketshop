alter table TICKETSHOP_TICKET alter column TICKETID_ID rename to TICKETID_ID__U90046 ^
alter table TICKETSHOP_TICKET alter column TICKETID_ID__U90046 set null ;
alter table TICKETSHOP_TICKET drop constraint FK_TICKETSHOP_TICKET_ON_TICKETID ;
drop index IDX_TICKETSHOP_TICKET_ON_TICKETID ;
-- alter table TICKETSHOP_TICKET add column TICKETID varchar(255) ^
-- update TICKETSHOP_TICKET set TICKETID = <default_value> ;
-- alter table TICKETSHOP_TICKET alter column TICKETID set not null ;
alter table TICKETSHOP_TICKET add column TICKETID varchar(255) ;
