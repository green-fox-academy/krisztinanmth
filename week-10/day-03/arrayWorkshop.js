'use strict'

//Spread syntax: 
const evens = [2, 4, 6, 8];
const numbers = [1, 3, 5, 7, ...evens];
console.log(numbers); // expected output: [1, 3, 5, 7, 2, 4, 6, 8]

// concatenating two arrays
let arr1 = [0, 1, 2];
let arr2 = [3, 4, 5];
arr1 = [...arr1, ...arr2];
console.log(arr1);

//Array methods
console.log(['apple', 'pear', 'melon'].indexOf('pear')); // 1

['apple', 'pear', 'melon'].forEach((fruit, i) => console.log(fruit, i));

const triples = [1, 2, 3, 4, 5].map(number => number * 3)
console.log(triples); // [3, 6, 9, 12, 15]

const evens2 = [1, 2, 3, 4, 5].filter(number => number % 2 === 0);
console.log(evens2); // [2, 4]

const isAllEven = [2, 6, 14, 5, 4].every(number => number % 2 === 0);
console.log(isAllEven); // false

const isAnyEven = [2, 6, 14, 5, 4].some(number => number % 2 === 0);
console.log(isAnyEven); // true

const letters = 'apple'.split('');
console.log(letters); // ['a', 'p', 'p', 'l', 'e']
console.log(letters.join('@')); // Worms in the apple!

// - Create a variable named `magicNumbers`
//   with the following content: `[1, 3, 5, 7]`
// - Print the third element of `magicNumbers`
const magicNumbers = [1, 3, 5, 7];
console.log(magicNumbers[2]);

// - Create a variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create a variable named `p2`
//   with the following content: `[4, 5]`
// - Log to the console if `p2` has more elements than `p1`
const p1 = [1, 2, 3];
const p2 = [4, 5];

function isBigger(p1, p2) {
    return (p2.length > p1.length)
}
console.log(isBigger(p1, p2));

// - Create a variable named `r` with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element
const r = [54, 23, 66, 12];
const sum = r[1] + r[2];
console.log(sum);

// - Create a variable named `abc` with the following content: `["Arthur", "Boe", "Chloe"]`
// - Swap the first and the third element of `abc`
const abc = ["Arthur", "Boe", "Chloe"];
let temp = abc[0];
abc[0] = abc[2];
abc[2] = temp;
console.log(abc);

// - Create a variable named `numbers` with the following content: `[4, 5, 6, 7]`
// - Log each the element of `numbers` to the console*
// *hint: use a loop, console.log(numbers) won't cut it
// - bonus for using the correct built in array method
const numbers2 = [4, 5, 6, 7];
numbers2.forEach((number) => console.log(number));
