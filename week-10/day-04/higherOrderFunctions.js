'use strict'

// console.log(sum(range(1, 10)));

function repeatLog(n) {
    for (let i = 0; i < n; i++) {
      console.log(i);
    }
  }

function repeat(n, action) {
    for (let i = 0; i < n; i++) {
      action(i);
    }
  }
  repeat(5, repeatLog);

  let labels = [];
  repeat(5, i => {
    labels.push(`Unit ${i + 1}`);
  });
  console.log(labels);
  // → ["Unit 1", "Unit 2", "Unit 3", "Unit 4", "Unit 5"]

  let phases = [];
  repeat(3, i => {
      phases.push(`phase ${i + 1}`);  //that is A BACKTICK!!!!!!!!!!!!!!!!!
  });
  console.log(phases);

  function greaterThan(n) {
    return m => m > n;
  }
  let greaterThan10 = greaterThan(10);
  console.log(greaterThan10(11));
  // → true
  let greaterThan11 = greaterThan(11);
  console.log(greaterThan11(11));
  console.log(greaterThan11(10));
  console.log(greaterThan11(13));

  function reduce(array, combine, start) {
    let current = start;
    for (let element of array) {
      current = combine(current, element);
    }
    return current;
  }
  const myCombine = (a, b) => a + b;
  console.log(reduce([1, 2, 3, 4], myCombine , 0));
  // → 10
  // or console.log(reduce([1, 2, 3, 4], (a, b) => a + b, 0)); - this is the same as line 51 :)
  const myMultiply = (n1, n2) => n1 * n2;
  console.log(reduce([3, 5, 7, 1], myMultiply, 1));

  // Fibonacci fv: az argumentum az elem sorszáma, a visszatérési érték maga az elem:
// var fibonacci = function(n) {
//     if (n < 2) {
//       return n;
//     } else {
//       return fibonacci(n - 1) + fibonacci(n - 2);
//     }
//   }
//   for (var i = 0; i < 100; i++) console.log(fibonacci(i) + ', ');
//ez nem jo....nezd at
