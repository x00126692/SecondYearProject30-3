# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table fuel_sales (
  id                            integer not null,
  fuel_type                     varchar(255),
  date                          varchar(255),
  unit_sp                       double,
  unit_net                      double,
  unit_cp                       double,
  unit_profit                   double,
  qty_sold                      integer,
  val_sold                      integer,
  net                           integer,
  profit                        double,
  constraint pk_fuel_sales primary key (id)
);
create sequence fuel_sales_seq;


# --- !Downs

drop table if exists fuel_sales;
drop sequence if exists fuel_sales_seq;

