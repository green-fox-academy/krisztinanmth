'use strict'

var animals = [
  {name: 'fluffykins', species: 'rabbit'},
  {name: 'caro', species: 'dog'},
  {name: 'hamilton', species: 'dog'},
  {name: 'harold', species: 'fish'},
  {name: 'ursula', species: 'cat'},
  {name: 'jimmy', species: 'fish'}
]
/*
var names = animals.map(function(animal) {
  return animal.name
})
*/

var names = animals.map((animal) => animal.name)
// or var names = animals.map((x) => x.name)
//in functional programming it is common to name variables like the x above....
/*
var names = [];
for (let i = 0; i < animals.length; i++) {
  names.push(animals[i].name)
}
*/

console.log(names);
