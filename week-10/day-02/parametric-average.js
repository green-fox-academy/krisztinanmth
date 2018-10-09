// Write a program that asks for a number.
// It would ask this many times to enter an number,
// if all the numbers are entered, it should print the sum and average of these
// numbers like:
//
// Sum: 22, Average: 4.4

//need to check how to use this prompt
var first = prompt('enter a value', '0'); 
var second = prompt('enter a value', '0');
var third = prompt('enter a value', '0');

var firstNum = parseInt(first, 10);
var secondNum = parseInt(second, 10); //you need the radix(base) ....which is this 10 ...in case of parseFloat you don't need radix
var thirdNum = parseInt(third, 10);

const sum = firstNum + secondNum + thirdNum;
const average = sum / 3;

console.log('sum: ' + sum);
console.log('average: ' + average);