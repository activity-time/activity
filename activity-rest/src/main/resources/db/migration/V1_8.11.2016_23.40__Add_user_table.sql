create table User (
    ID bigint auto_increment PRIMARY KEY,
    NAME varchar(128) not null
);

alter table Stream add user_id bigint;
alter table Stream add CONSTRAINT fk_stream_user FOREIGN KEY (user_id) REFERENCES user(id);