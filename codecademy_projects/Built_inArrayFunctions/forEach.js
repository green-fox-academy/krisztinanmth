'use strict';

const veggies = ['broccoli', 'spinach', 'cauliflower', 'broccoflower'];

const politelyDecline = (veg) => {
      console.log('No ' + veg + ' please. I will have pizza with extra cheese.');
}

// Write your code here:
const declineEverything = array => {
  array.forEach(politelyDecline);
}
declineEverything(veggies);

const acceptEverything = array => {
  array.forEach(e => console.log(`Ok, I guess I will eat some ${e}.`));
}
acceptEverything(veggies);
