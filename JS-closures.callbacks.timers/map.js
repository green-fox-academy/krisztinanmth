'use strict';
// count occurrence of 'a' letter
// Please use the map method.

var fruits = [
  'melon',
  'apple',
  'strawberry',
  'blueberry',
  'pear',
  'banana',
  'ananas'
];

let count = 0;
const numberOfA = fruits.map(function(fruit) {
  for (let i = 0; i < fruit.length; i++) {
    if (fruit.charAt(i) === 'a') {
      count++;
    }
  }
  return count;
});

console.log(count);
