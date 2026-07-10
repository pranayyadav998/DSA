SELECT 
    MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary < (SELECT MAX(DISTINCT Salary) FROM Employee);