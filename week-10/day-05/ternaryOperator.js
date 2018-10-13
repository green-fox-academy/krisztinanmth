'use strict';

/*
Basic JavaScript: Use the Conditional (Ternary) Operator
The conditional operator, also called the ternary operator, 
can be used as a one line if-else expression.
The syntax is:

        condition ? statement-if-true : statement-if-false;

The following function uses an if-else statement to check a condition:

                function findGreater(a, b) {
                if(a > b) {
                    return "a is greater";
                }
                else {
                    return "b is greater";
                }
                }
This can be re-written using the conditional operator:

                function findGreater(a, b) {
                return a > b ? "a is greater" : "b is greater";
                }
*/

//Use the conditional operator in the checkEqual function to check if 
//two numbers are equal or not. The function should return either true or false.

function checkEqual(a, b) {
    return a === b ? true : false;
  }
  
  console.log(checkEqual(1, 2));
  console.log(checkEqual(0, 0));
  console.log(checkEqual(-1, 1));
  console.log(checkEqual(-1, 3));
  console.log(checkEqual(-1, -1));

/*
In the previous challenge, you used a single conditional operator. 
You can also chain them together to check for multiple conditions.

The following function uses if, else if, and else statements to 
check multiple conditions:

                    function findGreaterOrEqual(a, b) {
                    if(a === b) {
                        return "a and b are equal";
                    }
                    else if(a > b) {
                        return "a is greater";
                    }
                    else {
                        return "b is greater";
                    }
                    }
The above function can be re-written using multiple conditional operators:

        function findGreaterOrEqual(a, b) {
        return (a === b) ? "a and b are equal" : (a > b) ? "a is greater" : "b is greater";
        }
*/

//Use multiple conditional operators in the checkSign function 
//to check if a number is positive, negative or zero.

function checkSign(num) {
    return (num < 0) ? "negative" : (num > 0) ? "positive" : "zero"
  }
  
  console.log(checkSign(10));
  console.log(checkSign(-3));
  console.log(checkSign(0));
  