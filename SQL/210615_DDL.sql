-- 2021.06.15

-- DDL : 데이터 정의어

-- 테이블 생성 : create table
-- 테이블 수정 : alter table
-- 테이블 삭제 : drop table

-- create table (
--      컬럼이름 타입(사이즈) 제약조건 정의,
--      .....
-- )

-- create table (
--      컬럼이름 타입(사이즈) 제약조건 정의,
--      .....,
--      제약조건 정의,
--      ....
-- )


-- 사원 테이블과 유사한 구조의 
-- 사원번호, 사원이름, 급여 3개의 칼럼으로 구성 된 
-- EMP01 테이블을 생성해 봅시다.

create table emp01 (    
    empno number (4), -- 사원번호
    ename varchar2(20), -- 사원이름
    sal number(6,2)
);

-- 서브쿼리를 이용해서 기존 테이블의 구조를 복사하고 해당 튜플도 복사
-- 제약조건은 가져오지 않는다
-- 데이터 백업용도로 사용.
create table emp02
as 
select * from emp
;

select * from emp02;

create table emp03
as
select empno, ename, sal from emp;

select * from emp03;

create table emp04
as 
select * from emp where deptno=30
;


-- 테이블의 변경 : alter table
-- alter table {테이블 이름} add
-- alter table {테이블 이름} modify
-- alter table {테이블 이름} drop

-- emp01 테이블에 job 컬럼을 추가해보자
alter table emp01
add (job varchar2(9) )
;
desc emp01;

-- emp01 테이블의 job 컬럼의 사이즈를 수정 9-> 30
alter table emp01
modify ( job varchar2(130) not null );


-- emp01 테이블의 job 컬럼을 삭제
alter table emp01 
drop column job 
;

