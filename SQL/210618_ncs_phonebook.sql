-- 21.06.19
-- NCS Example

-- 1.
--===== 전화번호 부( 테이블 이름 : Contact )

------ 기본정보(not null)
-- 대리키 : 일련번호   -> pIdx 기본키로 설정
-- 이름, 전화번호, 주소, 이메일 
-- 주소값과 이메일은 입력이 없을 때 기본값 입력
-- 친구의 타입 (카테고리)   : univ, com, cafe 세가지 값만 저장 가능

------ 선택 정보
-- 전공, 학년
-- 회사이름, 부서이름, 직급
-- 모임이름, 닉네임


create table contact (
-- 기본정보 
    pidx number(4) constraint contact_serial_pk primary key,
    name VARCHAR2(20) constraint contact_name_nn not null,
    phonenumber varchar2(20) constraint contact_phonenumber_nn not null,
    address varchar2(20),
    email varchar2(20),
    friendtype varchar(4) constraint contact_friendtype_ck check(friendtype in('univ', 'com', 'cafe')) not null,
-- 선택정보 
    major VARCHAR(20),
    year number(1),
    companyname varchar2(20),
    deptname varchar2(20),
    job varchar2(20),
    meetingname varchar2(20),
    nickname varchar2(20)
);

select * from contact;


-- 2. DEPT 테이블에 데이터를 삽입하는 SQL을 작성하시오. 
-- 입력 데이터는 임의로 작성하시오.
desc dept;
select * from dept;

-- INSERT : CREATE
DESC phoneinfo_basic;

insert into dept
values (50, 'COMPUTER', 'KOREA')
;
 
 
 -- 3. DEPT 테이블에 위에서 삽입한 데이터의 dname, loc 데이터를 변경하는 SQL을 작성하시오.
update dept
set dname = 'TEACHER', loc='MANAGER'
where deptno=50
;

--  4. DEPT 테이블에 위에서 삽입한 데이터를 deptno 컬럼의 값을 기반으로 삭제하는 SQL을 작성하시오.
delete from dept
where deptno=50;
    
    
select * from
all_constraints
where table_name = 'contact';


select * from emp;
    

create view emp_view
as
select *
from emp e, dept d
where e.deptno = d.deptno;

CREATE VIEW EMP_VIEW
AS 
SELECT *
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;


update emp
set deptno = (select deptno
              from emp 
              where ename='SCOTT');
