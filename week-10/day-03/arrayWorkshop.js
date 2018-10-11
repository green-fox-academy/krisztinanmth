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

// - Create an array named `s` with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4 with the `.map` method 
// - Print the fourth element as a test
const s = [1, 2, 3, 8, 5, 6].map(num => num / 2);
console.log(s[3]);

// - Create a variable named `t` with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element simply by accessing it
// - Log the third element to the console
const t = [1, 2, 3, 4, 5];

function iterateThirdElement(inputArray) {
    for (let i = 0; i < inputArray.length; i++) {
        if (i == 2) {
           inputArray[i] *= 2; 
        }
    }
    return inputArray;
}
console.log(iterateThirdElement(t));

// - Create a variable named `animals`
//   with the following content: `['koal', 'pand', 'zebr']`
// - Add all elements an `"a"` at the end
// - try to use built in functions instead of loops
const animals = ['koal', 'pand', 'zebr'];
animals.forEach(animal => console.log(animal.concat('a')));

// - Create an array variable named `drinks` with the following content: `['Gin', 'Whiskey', 'Wine', 'Beer']`
// - Double all the strings in the array, use a built in array method instead of a loop
// It should print: ['GinGin', 'WhiskeyWhiskey', 'WineWine', 'BeerBeer']`

const drinks = ['Gin', 'Whiskey', 'Wine', 'Beer'].map(drink => drink.concat(drink));
console.log(drinks);

// - Create a two dimensional list
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
const colors = [
    ['lime', 'forest green', 'olive', 'pale green', 'spring green'],
    ['orange red', 'red', 'tomato'],
    ['orchid', 'violet', 'pink', 'hot pink']
];
console.log(colors[0])
console.log(colors[1])
console.log(colors[2])

// - Create a variable named `ai` with the following content: `[3, 4, 5, 6, 7]`
// - Log the sum of the elements in `ai` to the console
const ai = [3, 4, 5, 6, 7];

function sumElementsOfArray(inputArray) {     //////    UNDEFINED ???????????????????????????????????????????????????????????????????????????????????
    let sum = 0;
    for (let i = 0; i < inputArray.length - 1; i++) {
        sum += inputArray[i];
        return sum;
    }
}
console.log(sumElementsOfArray(ai));

// - Create (dynamically*) a two dimensional list
//   with the following matrix**. Use a loop!
//
//   0 0 0 1
//   0 0 1 0
//   0 1 0 0
//   1 0 0 0
//
// - Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array

function createMatrix(rows, cols) {   ////// EZT AZ EGESZ MATRIXOSAT CSINALD ELOLROL REGGEL!!!!!!!!!!!!!!!!!!!!!!!!!!
    let matrixArray = [];
    for (let i = 0; i < rows; i++) {
        matrixArray.push([]);
        matrixArray[i].push(new Array(cols));
        for(var j=0; j < cols; j++){
            if (matrixArray[i][j] != matrixArray[i][matrixArray.length - 1 - i]) {
                console.log(1)
            } else {
                console.log(0);
            }
    
        }
    }
}

console.log(createMatrix(4, 4));


function matrix( rows, cols, defaultValue){

    var arr = [];
  
    // Creates all lines:
    for(var i=0; i < rows; i++){
  
        // Creates an empty line
        arr.push([]);
  
        // Adds cols to the empty line:
        arr[i].push( new Array(cols));
  
        for(var j=0; j < cols; j++){
          // Initializes:
          arr[i][j] = defaultValue;
        }
    }
  
  return arr;
  }
  console.log(matrix(4, 4, 5));

  // - Create a variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// 		- do it with the built in method
//		- do it with creating a new temp array and a loop
// - Print the elements of the reversed `aj`

