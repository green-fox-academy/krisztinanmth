'use strict';

const input = 'today is a great day';

const vowels = ['a', 'e', 'i', 'o', 'u'];

let resultArray = [];

const findAndDoubleAllVowels = (input, vowels) => {
  for (let i = 0; i < input.length; i++) {
    for (let j = 0; j < vowels.length; j++) {
    	if (input[i] === vowels[j]) {
        if (input[i] === 'a') {
          resultArray.push('aa');
        } else if (input[i] === 'e') {
          resultArray.push('ee');
        } else if (input[i] === 'i') {
          resultArray.push('ii');
        } else if (input[i] === 'o') {
          resultArray.push('oo');
        } else if (input[i] === 'u') {
          resultArray.push('uu');
        }
      }
    }
  }
  return resultArray;
}

const joinArrayAndCapitalize = array => array.join('').toUpperCase();


findAndDoubleAllVowels(input, vowels);
console.log(joinArrayAndCapitalize(resultArray));

findAndDoubleAllVowels('Hi Human', vowels);
console.log(joinArrayAndCapitalize(resultArray));

findAndDoubleAllVowels('turpentine and turtles', vowels);
console.log(joinArrayAndCapitalize(resultArray));
