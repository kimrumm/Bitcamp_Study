CREATE TABLE MONEY (
 MKEY INTEGER PRIMARY KEY,
 MNAME VARCHAR2(20) NOT NULL,
 MVALUE INTEGER NOT NULL,
 MCOUNT INTEGER NOT NULL
);

INSERT INTO MONEY VALUES (1,'오백원',500,10);
INSERT INTO MONEY VALUES (2,'백원',100,10);

commit;

select * from money;

drop table money;