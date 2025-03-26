SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT num,
           LEAD(num, 1) OVER() AS num1,
           LEAD(num, 2) OVER() AS num2
    FROM logs
) t
WHERE num = num1 AND num = num2;
