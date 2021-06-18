-- 2021.06.18

--JDBC

select * from dept;

insert into dept01 values (dept01_deptno_seq.nextval,10,'dev','SEOUL');

-- dept01 테이블에 deptno에 입력할 일련 번호 -> sequence
create sequence dept01_deptno_seq
start with 10
increment by 10;

delete from dept01 where deptno=?


update dept01 set dename=?, loc=? where deptno=?
