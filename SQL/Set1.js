/*
Tabel Name : CITY 
Table : [CITY]
  Field         Type
  ID            NUMBER
  NAME          VARCHAR(17)
  COUNTRY CODE  VARCHAR2(3)
  DISTRICT      VARCHAR2(20)
  POPULATION    NUMBER
Question 1 : Query all columns (attributes) for every row in the CITY table.
Question 2 : Query all columns for all American cities in CITY with populations larger than 100000. The CountryCode for America is USA.
Question 3 : Query the names of all American cities in CITY with populations larger than 120000. The CountryCode for America is USA.
Question 4 : Query all columns for a city in CITY with the ID 1661.
Question 5 : Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
Question 6 : Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.

*/

module.exports = {
    question1 = {
        solution : 'SELECT * FROM CITY'
    },
    question2 = {
        solution : 'SELECT * FROM CITY WHERE COUNTRYCODE="USA" AND POPULATION >100000'
    },
    question3 = {
        solution : 'SELECT NAME FROM CITY WHERE COUNTRYCODE="USA" AND POPULATION >120000'
    },
    question4 = {
        solution : 'SELECT * FROM CITY WHERE ID=1661'
    },
    question5 = {
        solution : 'SELECT * FROM CITY WHERE COUNTRYCODE = "JPN" '
    },
    question6 = {
        solution : 'SELECT NAME FROM CITY WHERE COUNTRYCODE="JPN"'
    }
}
