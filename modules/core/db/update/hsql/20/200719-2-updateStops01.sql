-- alter table TICKETSHOP_STOPS add column ROUTEID_ID varchar(36) ^
-- update TICKETSHOP_STOPS set ROUTEID_ID = <default_value> ;
-- alter table TICKETSHOP_STOPS alter column ROUTEID_ID set not null ;
alter table TICKETSHOP_STOPS add column ROUTEID_ID varchar(36) not null ;
