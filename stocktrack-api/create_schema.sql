create database stocktrack;
use stocktrack;

create table test
(
    id   bigint NOT NULL AUTO_INCREMENT,
    name varchar(255),
    PRIMARY KEY (id)
);

create table alerts
(
    id   bigint NOT NULL AUTO_INCREMENT,
    ticker varchar(10),
    alertType int,
    alertValue double,
    activeFlag tinyint,
    PRIMARY KEY (id)
);

create table alertHistory
(
    id   bigint NOT NULL AUTO_INCREMENT,
    alertId bigint,
    alertDate datetime,
    stockDataId bigint,
    PRIMARY KEY (id)
);

create table stockData
(
    id    bigint NOT NULL AUTO_INCREMENT,
    ticker varchar(10),
    timePulled datetime,
    price double,
    dollarChange double,
    percentChange double,
    PRIMARY KEY (id)
);

create table properties
(
    theKey varchar(255),
    theValue varchar(255),
    primary key(theKey)
);



