/*
Table : STATION
  Field     TYPE
  ID        NUMBER
  CITY      VARCHAR2(21)
  STATE     VARCHAR2(2)
  LAT_N     NUMBER          ------> Northern Latitude
  LONG_W    NUMBER         -------> Western Latitude

        If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.
Question 5 : 
Question 6 : 

*/

module.exports = {
    question1 = {
        question : 'Query a list of CITY and STATE from the STATION table.',
        solution : 'SELECT CITY,STATE FROM STATION'
    },
    question2 = {
        question : 'Query a list of CITY names from STATION with even ID numbers only. You may print the results in any order, but must exclude duplicates from your answer.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE ID%2=0'
    },
    question3 = {
        question : 'Let N be the number of CITY entries in STATION, and let N* be the number of distinct CITY names in STATION,query the value of N-N* from STATION. In other words, find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.',
        solution : 'SELECT COUNT(CITY)-COUNT(DISTINCT CITY) FROM STATION'
    },
    question4 = {
        question : 'Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name).',
        solution : '(select CITY, length(CITY) from STATION order by length(CITY) limit 1) UNION (select CITY, length(CITY) from STATION order by length(CITY) DESC limit 1)'
    },
    question5 = {
        question : 'Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE  CITY LIKE "%A" OR CITY LIKE "E%" OR CITY LIKE "I%" OR CITY LIKE "O%" OR CITY LIKE "U%"'
    },
    question6 = {
        question : 'Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE  CITY LIKE "%" OR CITY LIKE "%E" OR CITY LIKE "%I" OR CITY LIKE "%O" OR CITY LIKE "%U"'
    },
    question7 = {
        question : 'Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE left(city,1) IN ("a","e","i","o","u")  AND right(city, 1) IN ("a","e","i","o","u")'
    },
    question8 = {
        question : 'Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE left(CITY,1) NOT IN("A","E","I","O","U")'
    },
    question9 = {
        question : 'Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE right(CITY,1) NOT IN("A","E","I","O","U")'
    },
    question10 = {
        question : 'Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE left(CITY,1) NOT IN("A","E","I","O","U") UNION SELECT DISTINCT CITY FROM STATION WHERE right(CITY,1) NOT IN("A","E","I","O","U")'
    },
    question11 : {
        question : 'Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.',
        solution : 'SELECT DISTINCT CITY FROM STATION WHERE left(CITY,1) NOT IN ("A","E","I","O","U") AND right(CITY,1) NOT IN ("A","E","I","O","U")'
    }
}
