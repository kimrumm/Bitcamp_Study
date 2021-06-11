-- 2021.06.11

-- JOIN

-- CROSS JOIN
-- 스키마의 합 : 지하의 곱 연산과 같다

select *
from emp, dept 
where emp.deptno=deptno
;