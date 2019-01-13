'use strict';

const menu = {
  _courses: {
     _appetizers: [],
     _mains: [],
     _desserts: [],
    set appetizers (appetizer) {
      this._appetizers.push(appetizer);
    },
    set mains (main) {
      this._mains.push(main);
    },
    set desserts (dessert) {
      this._desserts.push(dessert);
    },
    get appetizers () {
      return this._appetizers;
    },
    get mains () {
      return this._mains;
    },
    get desserts () {
      return this._desserts;
    }
  },
  get courses () {
     return {
       appetizers: this._courses.appetizers,
       mains: this._courses.mains,
       desserts: this._courses.desserts
     }
   },
  addDishToCourse (courseName, dishName, dishPrice) {
    const dish = {
      name: dishName,
      price: dishPrice
    };
    this._courses[courseName].push(dish);
  },
  getRandomDishFromCourse (courseName) {
    const dishes = this._courses[courseName];
    const randomIndex = Math.floor(Math.random() * dishes.length);
    return dishes[randomIndex];
  },
  generateRandomMeal () {
    const appetizer = this.getRandomDishFromCourse("appetizers");
    const main = this.getRandomDishFromCourse("mains");
    const dessert = this.getRandomDishFromCourse("desserts");
    const totalPrice = appetizer.price + main.price + dessert.price;
    return `Your meal is ${appetizer.name}, ${main.name}, ${dessert.name}. Your total is $${totalPrice}.`
  }
}



menu.addDishToCourse('appetizers', 'sushi', 6.50);
menu.addDishToCourse('appetizers', 'halloumi', 3.00);
menu.addDishToCourse('appetizers', 'corn on the cob', 5.00);

menu.addDishToCourse('mains', 'pizza', 12.00);
menu.addDishToCourse('mains', 'pesto chicken salad', 9.00);
menu.addDishToCourse('mains', 'pasta pesto', 12.00);

menu.addDishToCourse('desserts', 'banana cake', 3.00);
menu.addDishToCourse('desserts', 'ice cream', 3.00);
menu.addDishToCourse('desserts', 'choco chip', 2.50);

//let meal = //menu.generateRandomMeal();
//console.log(meal);

console.log(menu.courses)

console.log(menu.generateRandomMeal());
