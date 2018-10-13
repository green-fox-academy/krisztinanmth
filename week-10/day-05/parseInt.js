'use strict';

/*
The parseInt() function parses a string and returns an integer. 
Here's an example:

    var a = parseInt("007");

The above function converts the string "007" to an integer 7.  
If the first character in the string can't be converted into a number, 
then it returns NaN.
*/

//Use parseInt() in the convertToInteger function so it converts the input 
//string str into an integer, and returns it.

function convertToInteger(str) {
    return parseInt(str);
  }

  console.log(convertToInteger("42"));
  console.log(convertToInteger("ABC"));
  console.log(convertToInteger("L2"));
  console.log(convertToInteger("1B"));
  console.log(convertToInteger(""));