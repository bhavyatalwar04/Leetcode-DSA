# Write your MySQL query statement below
Select MAX(salary) AS  SecondHighestSalary from Employee where salary<(select MAX(salary) from Employee);