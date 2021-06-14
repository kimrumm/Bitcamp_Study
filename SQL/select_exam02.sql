<<<<<<< HEAD:java/SQL/select_exam02.sql
-- 마당서적 연습문제
desc book;
select * from book;
desc customer;
desc orders;

--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(1) 도서번호가1인도서의이름
select bookname
from book
where bookid=1
;

--(2) 가격이20,000원이상인도서의이름
select bookname 
from book
where price <20000
;


--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)

=======
----1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
DESC BOOK;
DESC COSTOMER;
DESC ORDERS;

--(1) 도서번호가1인도서의이름
SELECT BOOKNAME
FROM BOOK
WHERE BOOKID=1
;

--(2) 가격이20,000원이상인도서의이름
SELECT BOOKNAME
FROM BOOK
WHERE PRICE < 20000
;

--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
SELECT SUM(SALEPRICE) AS TOTALPAY
FROM ORDERS
WHERE CUSTID=1
;
>>>>>>> 72bcb416ba045a3611dae5b125ef4f3f6147132d:SQL/select_exam02.sql

--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
SELECT SUM(BOOKID)
FROM ORDERS
WHERE CUSTID=1
;


--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(1) 마당서점도서의총개수
SELECT COUNT(*) AS BOOKALL
FROM BOOK
;

--(2) 마당서점에도서를출고하는출판사의총개수


--(3) 모든고객의이름, 주소
SELECT NAME,ADDRESS
FROM CUSTOMER
;
--(4) 2014년7월4일~7월7일사이에주문받은도서의주문번호
<<<<<<< HEAD:java/SQL/select_exam02.sql
select 
from book
=======
SELECT ORDERID
FROM ORDERS
WHERE ORDERDATE BETWEEN '14/07/04' AND '14/07/07'
>>>>>>> 72bcb416ba045a3611dae5b125ef4f3f6147132d:SQL/select_exam02.sql
;

--(5) 2014년7월4일~7월7일사이에주문받은도서를제외한도서의주문번호
SELECT ORDERID
FROM ORDERS
WHERE NOT ORDERDATE BETWEEN '14/07/04' AND '14/07/07' 
;

--(6) 성이‘김’씨인고객의이름과주소
SELECT NAME,ADDRESS
FROM CUSTOMER
WHERE NAME LIKE '김%' 
;

--(7) 성이‘김’씨이고이름이‘아’로끝나는고객의이름과주소
SELECT NAME,ADDRESS
FROM CUSTOMER
WHERE NAME LIKE '김%아'