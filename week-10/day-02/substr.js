
//  Create a function that takes two strings as a parameter
//  Returns the starting index where the second one is starting in the first one
//  Returns `-1` if the second string is not in the first one
let str = 'i\'m a string';
let str2 = 'i\'m a ninja';
let myWord = 'ninja';

function substr(str, myWord) {
    return (str.indexOf(myWord));
}

console.log(substr(str, myWord));
console.log(substr(str2, myWord));

//  Example
console.log(substr('this is what I\'m searching in', 'searching'));
// should print: `17`
console.log(substr('this is what I\'m searching in', 'not'));
// should print: `-1`