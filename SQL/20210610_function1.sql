-- 2021.06.10
-- function : 단일행 함수, 집합(다중행) 함수
-- 단일행 함수 : 하나의 행이 포함하는 특정 컬럼의 값 하나를 처리하고 반환
-- 다중행(집합) 함수 : 여러행의 특정 컬럼값들을 대상으로 연산하고 반환


-- 숫자 함수
 SELECT ABS(10), ABS(-100)
 FROM DUAL
 ;

-- 소숫점 제거
SELECT FLOOR(15.7) 
FROM DUAL;

--소숫점 첫자리까지 표현 -는 정수방향, + 소숫점방향
SELECT ROUND(15.193,2), ROUND(15.193,-1)
FROM DUAL
;

-- 소숫점 부분을 절사해버린다. floor와 같음 
SELECT TRUNC(15.79,1), TRUNC(15.79)
FROM
DUAL;

-- 나눗셈
SELECT MOD(11,4)
FROM DUAL;

-- 사원들의 급여 
SELECT SAL, MOD(SAL,2)
FROM EMP
WHERE MOD(SAL,2) = 1
;


-- 문자 함수
-- concat(문자, 문자) -> '' || ''
SELECT CONCAT('abc', 'efg'), 'abc' || 'efg'
FROM DUAL
;

-- substr : 문자열 추출
-- substr(문자열, 시작 위치, 길이)
-- sql -> index는 1부터 시작 (자바는 0)
SELECT SUBSTR('apple', 1,3)
FROM DUAL;

-- 역행 추출
SELECT SUBSTR('apple',-3)
FROM DUAL;

-- replace : 특정 문자열 (패턴) 다른 문자열 (패턴)으로 변경
SELECT REPLACE('JACK and JUE','J','BL')
FROM DUAL;

SELECT SYSDATE
FROM DUAL;


------------------------
-- 2021.06.11
------------------------

-- 형변환 함수
-- 날짜->문자, 숫자 -> 문자
-- 문자->숫자, 문자->날짜
-- to_char(날짜 데이터, 패턴), to_char(숫자,"yyyy.mm.dd.")
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY.MM.DD. HH24:MI:SS')
FROM DUAL;

select ename, hiredate, to_char(hiredate, 'YYYY.MM.DD.')
from emp
;

SELECT * FROM ORDERS;
SELECT ORDERID, ORDERDATE, TO_CHAR(ORDERDATE, 'YYYY.MM.DD.') 
FROM ORDERS
;


-- 숫자 -> 문자 
select to_char(123456, '0000000000'), to_char(123456,'9999999999')
from dual;

select empno, ename, sal, to_char(sal*1100,'L999,999,999')
from emp;


-- 문자 -> 숫자
-- to_number(문자열, 패턴)
select to_number('1,000,000','9,999,999'), 
       to_number('1,000,000','9,999,999')+10000

from dual;



-- 문자->날짜
-- to_date(문자열, 패턴)
select to_date('2012-05-17','YYYY-MM-DD'), 
        trunc((sysdate-TO_DATE('2012-05-17','YYYY-MM-DD'))/365) -- 만나이계산
from dual;

-- decode 함수 : 분기를 위해 사용 switch-case 유사
-- decode(컬럼, = 조건1 값, 조건1의 참일때 사용할 값
--              , 조건2 값, 조건2의 참일때 사용할 값
--              ,....
-- )

-- emp테이블에서 부서번호에 맞는 부서이름 출력
select * from dept;

-- 10 ACCOUNTING
-- 20 RESEARCH
-- 30 SALES
-- 40 OPERATIONS

select ename, deptno, 
       decode (deptno, 10, 'ACCOUNTING',
                       20, 'RESEARCH',
                       30, 'SALES',
                       40, 'OPERATIONS'
        ) as DNAME
from emp
order by dname
;

-- 8. 직급에 따라 급여를 인상하도록 하자.
-- 직급이 'ACCOUNTING'인 사원은 5%
-- 

select ename, sal,
    decode (job,'ANALYST', sal*1.05, -- 5%인상
               'SALESMAN', sal*1.1, --10%
               'MANAGER', sal*1.15, -- 15%
               'CLERK', sal*1.2 --20%
    
    ) as upsal
    
from emp
order by upsal
;

-- case 함수도 분기할 때 사용
-- case when 조건식 then 참일때 값
select ename, deptno,
        case when deptno=10 then 'ACCOUNTING'
             when deptno=20 then 'RESEARCH'
             when deptno=30 then 'SALES'
        end as deptname
from emp
order by deptname desc
;