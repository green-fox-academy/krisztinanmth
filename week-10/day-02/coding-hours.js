'use strict';

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
var dailyCodingHours = 6;
var lengthOfSemesterInWeeks = 17;
var workDaysInSemester = 17 * 5;

// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
var codingHoursInSemester = dailyCodingHours * workDaysInSemester;
console.log(codingHoursInSemester);

// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52
var averageWorkHoursWeekly = 52;
var workingHoursInSemester = averageWorkHoursWeekly * lengthOfSemesterInWeeks;
console.log(codingHoursInSemester / workingHoursInSemester * 100 + ' %');