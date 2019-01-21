'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

// Complete the insertionSort1 function below.
function insertionSort1(n, arr) {
    const numberToInsert = arr[n - 1];
    let i;
    for (i = n - 2; (i >= 0) && (arr[i] > numberToInsert); i--) {
        arr[i + 1] = arr[i];
        printArray(arr);
    }
    arr[i + 1] = numberToInsert;
    printArray(arr);
    }

const printArray = arr => console.log(arr.join(' '));


function main() {
    const n = parseInt(readLine(), 10);

    const arr = readLine().split(' ').map(arrTemp => parseInt(arrTemp, 10));

    insertionSort1(n, arr);
}
