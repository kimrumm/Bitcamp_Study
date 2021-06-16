-- PhoneBook DML
-- 21.06.16

-- INSERT : C REATE
-- SELECT : R EAD
-- UPDATE : U PDATE
-- DELETE : D ELETE

-- 1. phoneInfo_basic 테이블의 
-- SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneinfo_basic;
select * from phoneinfo_basic;

insert into phoneinfo_basic (idx, fr_name,fr_phonenumber, fr_email)
            values (1,'김천재','010-2112-5544','iamsmart@naver.com');

insert into phoneinfo_basic 
    values (2,'김태희','010-5555-1234','soprettyl@gmail.com','서울',sysdate);
    
insert into phoneinfo_basic 
    values (3,'비','010-5555-1323','rainboy@gmail.com','강남',sysdate);
    
update phoneinfo_basic
set fr_name = '김천재'
where fr_address = '서울'
;

select fr_name, fr_email
from phoneinfo_basic;

delete from phoneinfo_basic
where fr_name = '비';

delete from phoneinfo_basic;



-- 2. phoneinfo_univ 테이블의 
-- SELECT, UPDATE, DELETE, INSERT 하는 SQL
desc phoneinfo_univ;
select * from phoneinfo_univ;


-- 3. phoneinfo_com 테이블의 
-- SELECT, UPDATE, DELETE, INSERT 하는 SQL