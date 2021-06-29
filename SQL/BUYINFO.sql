
CREATE TABLE BUYINFO (
    
    BUYCODE NUMBER(4) CONSTRAINT BINFO_BCODE_PK PRIMARY KEY,
    BUYQTY INTEGER CONSTRAINT BINFO_BQTY_NN NOT NULL,
    TOTALPRICE INTEGER CONSTRAINT BINFO_TPRICE_NN NOT NULL,
    ITEMCODE NUMBER CONSTRAINT BINFO_ICODE_FK REFERENCES PRODUCTINFO(ITEMCODE) --참조코드
    
);

CREATE SEQUENCE BINFO_BCODE_SEQ
START WITH 1
INCREMENT BY 1;

SELECT * FROM BUYINFO;
DROP TABLE BUYINFO;
drop ;
alter table buyinfo
drop column buycode;


update BUYINFO set itemQty=itemQty+? where itemcode=?;

INSERT INTO BUYINFO VALUES (BINFO_BCODE_SEQ.NEXTVAL,20,14000,1);
INSERT INTO BUYINFO VALUES (BINFO_BCODE_SEQ.NEXTVAL,5,3000,2);
INSERT INTO BUYINFO VALUES (BINFO_BCODE_SEQ.NEXTVAL,2,12000,4);

select p.itemcode,p.name, b.buyqty, b.totalprice from PRODUCTINFO p, BUYINFO b where p.itemcode=b.itemcode;

select p.itemcode,p.name, b.buyqty, b.totalprice from PRODUCTINFO NATURAL BUYINFO;

select p.itemcode,p.name, b.buyqty, b.totalprice 
from PRODUCTINFO p, BUYINFO b 
where p.itemcode=b.itemcode and p.itemcode = '1';

order by b.totalprice desc;

drop SEQUENCE BINFO_BCODE_SEQ;

drop TABLE BUYINFO;

commit;




