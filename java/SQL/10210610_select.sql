-- 2021.06.10

-- 특정 데이터 검색 : 행 검색 -> 컬럼 선택

-- 10번 부서의 사원 리스트를 출력
-- 10번 부서 -> where dept = 10
select *
from emp
where deptno=10
;

-- 이름이 'SCOTT'인 사원을 출력
SELECT *
From EMP
WHERE ENAME='scott'
;

-- 날짜타입의 데이터 비교시에도 작은 따움표를 이용해야한다!!
SELECT *
from emp
where hiredate = '96/11/17'
;

-- 논리 연산자 : and, or, not
-- 10번 부서의 관리자(manager)를 찾아 출력
select *
from emp
where deptno=10 and job'MANAGER
;

-- 10번 부서의 직원들과 관리자들의 리스트를 출력
select *
from emp
where deptno=10 or job'MANAGER'
;

-- 10번 부서의 직원을 제외한 나머지 직원들을 출력