-- 2021.06.10
-- function : 단일행 함수, 집합(다중행) 함수
-- 단일행 함수 : 하나의 행이 포함하는 특정 컬럼의 값 하나를 처리하고 반환
-- 다중행(집합) 함수 : 여러행의 특정 컬럼값들을 대상으로 연산하고 반환


-- 숫자 함수
 select abs(10), abs(-100)
 from dual
 ;

-- 소숫점 제거
select FLOOR(15.7) 
from dual;

--소숫점 첫자리까지 표현 -는 정수방향, + 소숫점방향
select ROUND(15.193,2), round(15.193,-1)
from dual
;

-- 소숫점 부분을 절사해버린다. floor와 같음 
select trunc(15.79,1), TRUNC(15.79)
from
dual;

-- 나눗셈
select MOD(11,4)
from dual;

-- 사원들의 급여 
select sal, mod(sal,2)
from emp
where mod(sal,2) = 1
;


-- 문자 함수
-- concat(문자, 문자) -> '' || ''
select concat('abc', 'efg'), 'abc' || 'efg'
from dual
;

-- substr : 문자열 추출
-- substr(문자열, 시작 위치, 길이)
-- sql -> index는 1부터 시작 (자바는 0)
select substr('apple', 1,3)
from dual;

-- 역행 추출
select substr('apple',-3)
from dual;

-- replace : 특정 문자열 (패턴) 다른 문자열 (패턴)으로 변경
select REPLACE('JACK and JUE','J','BL')
from dual;

select sysdate
from dual;

