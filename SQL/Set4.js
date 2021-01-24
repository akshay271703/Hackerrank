/*
           TABLE  : Employee                          TABLE : CITY 
            _ _ _ _ _ _ _ _ _ _ _ _ _ _             _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
            |  COLUMN     |   TYPE      |           |  COLUMN     |   TYPE         |
            | employee_id |   INTEGER   |           | id          |   NUMBER       |
            | name        |   STRING    |           | name        |   VARCHAR2(17) |
            | months      |   INTEGER   |           | countrycode |   VARCHAR2(3)  |
            | salary      |   INTEGER   |           | district    |   VARCHAR2(20) |
            | _ _ _ _ _ _ _ _ _ _ _ _ _ |           | population  |   NUMBER       |
                                                    | _ _ _ _ _ _ _ _ _ _ _ _ _ ___|
*/

module.exports = {
    question1 : {
        question : 'Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.',
        solution : 'SELECT Name FROM Employee ORDER BY Name ASC'
    },
    question2 : {
        question : 'Write a query that prints a list of employee names (i.e.: the name attribute) for employees in Employee having a salary  greater than $2000 per month who have been employees for less than 10  months. Sort your result by ascending employee_id.',
        solution : 'SELECT Name FROM Employee WHERE salary > 2000 AND months <10'
    },
    question3 : {
        question : 'Query the difference between the maximum and minimum populations in CITY.',
        solution : 'SELECT MAX(POPULATION)-MIN(POPULATION) FROM CITY'
    }
}