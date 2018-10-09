'use strict';

// Write a program that stores 3 sides of a cuboid as variables (floats)
// The program should write the surface area and volume of the cuboid like:
let sideA = 10;
let sideB = 10;
let sideC = 10;
let surfaceArea = (sideA * sideB + sideA * sideC + sideB * sideC) * 2;
let volume = sideA * sideB * sideC;

// Surface Area: 600
// Volume: 1000
console.log('Surface Area: ' + surfaceArea);
console.log('Volume: ' + volume);