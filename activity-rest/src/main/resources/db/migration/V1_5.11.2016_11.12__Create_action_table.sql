create table Action (
  ID bigint auto_increment PRIMARY KEY,
  SUMMARY varchar(512) not null,
  MEMO varchar(1024) not null,
  WHO varchar(128),
  STATE varchar(128) not null,
  STREAM_ID bigint not null,
  FOREIGN KEY(STREAM_ID) REFERENCES Stream(ID)
);