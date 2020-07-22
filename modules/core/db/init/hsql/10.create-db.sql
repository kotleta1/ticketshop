-- begin TICKETSHOP_PASSENGER
create table TICKETSHOP_PASSENGER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PASSENGERID varchar(13) not null,
    FIO varchar(50) not null,
    --
    primary key (ID)
)^
-- end TICKETSHOP_PASSENGER
-- begin TICKETSHOP_TRIP
create table TICKETSHOP_TRIP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PASSENGERID_ID varchar(36),
    TICKETID_ID varchar(36),
    --
    primary key (ID)
)^
-- end TICKETSHOP_TRIP
-- begin TICKETSHOP_ROUTES
create table TICKETSHOP_ROUTES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ROUTEID bigint not null,
    VEHTYPE varchar(50),
    --
    primary key (ID)
)^
-- end TICKETSHOP_ROUTES
-- begin TICKETSHOP_TICKET
create table TICKETSHOP_TICKET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TICKETID varchar(255) not null,
    VEHTYPE varchar(50),
    PRICE double precision,
    DEPARTURETIME date,
    ARRIVALTIME date,
    ARRIVALPLACE varchar(50),
    DEPARTUREPLACE varchar(50),
    --
    primary key (ID)
)^
-- end TICKETSHOP_TICKET
-- begin TICKETSHOP_STOPS
create table TICKETSHOP_STOPS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STATIONS varchar(50),
    ROUTEID_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TICKETSHOP_STOPS
