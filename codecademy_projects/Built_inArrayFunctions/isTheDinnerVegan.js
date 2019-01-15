'use strict';

const isTheDinnerVegan = arr => arr.every(food => food.source === 'plant');

/*
// alternate solution:
// using a function declaration, loop, and helper function:
function isTheDinnerVegan(arr) {
      const isVegan = (food) => {
            if (food.source === 'plant') {
                  return true;
            }
            return false;
      }
      for(let i = 0; i<arr.length; i++){
            if (!isVegan(arr[i])){
                  return false
            }
      }
      return true
}
*/

const dinner = [{name: 'hamburger', source: 'meat'},
  {name: 'cheese', source: 'dairy'},
  {name: 'ketchup', source:'plant'},
  {name: 'bun', source: 'plant'},
  {name: 'dessert twinkies', source:'unknown'}];

console.log(isTheDinnerVegan(dinner));
