--display employees by ascending order of name
select * from emp order by ENAME;
--display employees with deptno = 10
select * from emp where DEPTNO = 10;
--display employees with deptno = 10 & 20
select * from emp where DEPTNO = 10 or DEPTNO = 20;
--display employees with commission = null
select * from emp where COMM IS NULL;
--display employees with salary between 2000 & 5000
select * from emp where SAL between 2000 and 5000;
--display employees name, salary, comm & annual salary etc
select *,(SAL + IFNULL(COMM,0))*12 as CTC from emp;
--display employees who are clerk
select * from emp where JOB = "CLERK";
--display employee name, hire date, experience
SELECT ENAME,HIREDATE,date_format(from_days(DATEDIFF(CURDATE(),HIREDATE)),'%Y')+0 AS EXPERIENCE from emp;
--display unique dept nos from emp table
select distinct DEPTNO from emp;
--display salary of scott
select ename,sal from emp where ENAME = "SCOTT";
--display all employees having same salary as scott
select * from emp where sal IN (select sal from emp where ENAME = "SCOTT");
--display all employees working in same dept of BLAKE
select * from emp where deptno IN (select deptno from emp where ENAME = "BLAKE");
--display no. of employees, avg of salary, sum of salary
select count(empno) as count, avg(sal) as Average_Sal, sum(sal) as Sum_of_Sal from emp;
--display deptwise no. of employees
select count(deptno), deptno from emp group by deptno;
--display jobwise no. of employees
select count(job), job from emp group by job;
--display deptwise jobwise no. of employees
select count(job),deptno,job from emp group by deptno,job order by deptno ;
--display deptwise jobwise no of employees with count greater than equal to 2
select count(job),deptno,job 
from emp 
group by deptno,job 
having count(job)>=2 
order by job desc;
--display deptwise jobwise no of employees with count greater than equal to 2 where deptno is 10 & 20
select count(job),deptno,job 
from emp 
where deptno = 10 or deptno = 20
group by deptno,job 
having count(job)>=2 
order by job desc;

select * from emp;
select * from dept;

--display empname and deptname in lowercase
select lower(ename) as Empname, lower(dname) as Deptname
from dept d
join emp e
on d.deptno = e.deptno;
--display all deptname and empname if any
select lower(dname) as Deptname, lower(ename) as Empname
from dept d
left outer join emp e
on d.deptno = e.deptno;
--display deptName where there are no employees
select lower(dname) as Deptname
from dept d
left outer join emp e
on d.deptno = e.deptno
where e.ename IS NULL;
--display empname with their manager name
select e1.ename as EmpName, e2.ename as ManagerName
from emp e1
left outer join emp e2
on e1.MGR = e2.EMPNO;

--display empname with their manager name and departmentno.
select e1.ename as EmpName, e2.ename as ManagerName, d.dname as DeptName
from emp e1
left outer join emp e2
on e1.MGR = e2.EMPNO
join dept d
on e1.deptno = d.deptno;

select * from emp;

select * from dept where deptno = 101 or 1=1;



