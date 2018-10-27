'use strict'

var animals = [
  {name: 'fluffykins', species: 'rabbit'},
  {name: 'caro', species: 'dog'},
  {name: 'hamilton', species: 'dog'},
  {name: 'harold', species: 'fish'},
  {name: 'ursula', species: 'cat'},
  {name: 'jimmy', species: 'fish'}
]

var dogs = animals.filter(function(animal) {
  return animal.species === 'dog'
})

/*
var dogs = [];
for (let i = 0; i < animals.length; i++) {
  if (animals[i].species === 'dog') {
    dogs.push(animals[i])
  }
}
*/
console.log(dogs);
