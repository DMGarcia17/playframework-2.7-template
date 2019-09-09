# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table currency (
  id                            serial not null,
  name                          varchar(255),
  symbol                        varchar(255),
  conversion_in_dollar          float not null,
  status                        integer,
  created_at                    timestamptz,
  updated_at                    timestamptz,
  deleted_at                    timestamptz,
  constraint pk_currency primary key (id)
);


# --- !Downs

drop table if exists currency cascade;

