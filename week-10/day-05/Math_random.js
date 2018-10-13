/*
Basic JavaScript: Generate Random Whole Numbers within a Range
Instead of generating a random number between zero and a given number 
like we did before, we can generate a random number that falls within a 
range of two specific numbers.

To do this, we'll define a minimum number min and a maximum number max.

Here's the formula we'll use. Take a moment to read it and 
try to understand what this code is doing:

Math.floor(Math.random() * (max - min + 1)) + min
*/

//Create a function called randomRange that takes a range myMin and 
//myMax and returns a random number that's greater than or equal to myMin, 
//and is less than or equal to myMax, inclusive.

//example
function ourRandomRange(ourMin, ourMax) {
    return Math.floor(Math.random() * (ourMax - ourMin + 1)) + ourMin;
  }
  
  ourRandomRange(1, 9);


//solution
function randomRange(myMin, myMax) {
    return Math.floor(Math.random() * (myMax - myMin + 1)) + myMin;
}
  var myRandom = randomRange(5, 15);
  var myRandom2 = randomRange(8, 22);
  var myRandom3 = randomRange(0, 7);
  var myRandom4 = randomRange(0, 0);

  console.log(myRandom);
  console.log(myRandom2);
  console.log(myRandom3);
  console.log(myRandom4);