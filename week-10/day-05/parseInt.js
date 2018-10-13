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



/*
Basic JavaScript: Use the parseInt Function with a Radix

The parseInt() function parses a string and returns an integer. 
It takes a second argument for the radix, which specifies the base of the 
number in the string. The radix can be an integer between 2 and 36.

The function call looks like:

    parseInt(string, radix);

And here's an example:

    var a = parseInt("11", 2);

The radix variable says that "11" is in the binary system, or base 2. 
This example converts the string "11" to an integer 3.
*/

//Use parseInt() in the convertToInteger function so it converts a binary 
//number to an integer and returns it.

function convertToInteger(str) {
  return parseInt(str, 2);
}
console.log(convertToInteger("10011"));
