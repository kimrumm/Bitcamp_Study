CREATE TABLE PRODUCTINFO (

    ITEMCODE NUMBER(4) CONSTRAINT PRODUCTINFO_ICODE_PF PRIMARY KEY,
    NAME VARCHAR2(20) CONSTRAINT PRODUCTINFO_NAME_NN NOT NULL,
    PRICE INTEGER CONSTRAINT PRODUCTINFO_PRICE_NN NOT NULL,
    ITEMQTY INTEGER

);


CREATE SEQUENCE PRODUCTINFO_ICODE_SEQ
START WITH 1
INCREMENT BY 1;




CREATE SEQUENCE PINFO_ICODE_SEQ.NEXTVAL
START WITH 1
INCREMENT BY 1;


INSERT INTO PRODUCTINFO VALUES (PRODUCTINFO_ICODE_SEQ.NEXTVAL, '콜라', 700, 1);
INSERT INTO PRODUCTINFO VALUES (PRODUCTINFO_ICODE_SEQ.NEXTVAL, '사이다', 800, 5);
INSERT INTO PRODUCTINFO VALUES (PRODUCTINFO_ICODE_SEQ.NEXTVAL, '마운틴듀', 600, 4);


select * from PRODUCTINFO;

drop SEQUENCE PRODUCTINFO_ICODE_SEQ
;

commit;