-- 다른 사용자에서 만들면 암호화 처리 되기때문에 직접 계정 생성
create user book_ex IDENTIFIED by book_ex;

grant connect, dba to book_ex;

-- 오라클 사용 포트 확
select dbms_xdb.gethttpport() from dual;

-- 오라클 8080포트 변경
exec dbms_xdb.sethttpport(9090);