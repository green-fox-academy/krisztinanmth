'use strict';

// Write your code here:
const findMyKeys = stringArray => stringArray.indexOf('keys');

const randomStuff = ['credit card', 'screwdriver', 'receipt', 'gum', 'keys', 'used gum', 'plastic spoon'];
console.log(findMyKeys(randomStuff));
// should print 4

const otherTestCase = ['kitty', 'uma', 'poppy'];
console.log(findMyKeys(otherTestCase));
// should print -1
