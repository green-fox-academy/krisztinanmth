'use strict';

/*
Basic JavaScript: Accessing Object Properties with Variables

Another use of bracket notation on objects is to access a property 
which is stored as the value of a variable. This can be very useful 
for iterating through an object's properties or when accessing a 
lookup table.

Here is an example of using a variable to access a property:
*/
var dogs = {
    Fido: "Mutt", Hunter: "Doberman", Snoopie: "Beagle"
  };
  var myDog = "Hunter";
  var myBreed = dogs[myDog];
  console.log(myBreed); // "Doberman"

  /*
  Another way you can use this concept is when the property's name 
  is collected dynamically during the program execution, as follows:
  */
var someObj = {
    propName: "John"
};
function propPrefix(str) {
    var s = "prop";
    return s + str;
}
var someProp = propPrefix("Name"); // someProp now holds the value 'propName'
console.log(someObj[someProp]); // "John"

/*
Note that we do not use quotes around the variable name when using it 
to access the property because we are using the value of the variable, 
not the name.
*/

/*
Update the myDog object's name property. Let's change her name from "Coder" to 
"Happy Coder". You can use either dot or bracket notation.
*/

// Example
var ourDog = {
    "name": "Camper",
    "legs": 4,
    "tails": 1,
    "friends": ["everything!"]
};
ourDog.name = "Happy Camper";
  // Setup
var myDog = {
    "name": "Coder",
    "legs": 4,
    "tails": 1,
    "friends": ["freeCodeCamp Campers"]
};
myDog.name = "Happy Coder";
myDog["name"] = "happy Coder";

/*
Add a "bark" property to myDog and set it to a dog sound, such as "woof". 
You may use either dot or bracket notation.
*/
var ourDog = {
    "name": "Camper",
    "legs": 4,
    "tails": 1,
    "friends": ["everything!"]
};
ourDog.bark = "bow-wow";
  // Setup
var myDog = {
    "name": "Happy Coder",
    "legs": 4,
    "tails": 1,
    "friends": ["freeCodeCamp Campers"]
};  
myDog.bark = "woof";
myDog['bark'] = "woof";
/*
We can also delete properties from objects like this:

delete ourDog.bark;
*/

/*
Basic JavaScript: Using Objects for Lookups
Objects can be thought of as a key/value storage, like a dictionary. If you have tabular data, you can 
use an object to "lookup" values rather than a switch statement or an if/else chain. This is most useful 
when you know that your input data is limited to a certain range.

Convert the switch statement into an object called lookup. Use it to look 
up val and assign the associated string to the result variable.
*/

// Setup
function phoneticLookup(val) {
    var result = "";
    // switch(val) {
    //     case "alpha": 
    //         result = "Adams";
    //         break;
    //     case "bravo": 
    //         result = "Boston";
    //         break;
    //     case "charlie": 
    //         result = "Chicago";
    //         break;
    //     case "delta": 
    //         result = "Denver";
    //         break;
    //     case "echo": 
    //         result = "Easy";
    //         break;
    //     case "foxtrot": 
    //         result = "Frank";
    // }
    var lookup = {
        'alpha': "Adams",
        'bravo': "Boston",
        'charlie': "Chicago",
        'delta': "Denver",
        'echo': "Easy",
        'foxtrot': "Frank"
      };
      result = lookup[val];
      return result;
}
console.log(phoneticLookup("charlie"));
console.log(phoneticLookup("foxtrot"));
console.log(phoneticLookup("echo"));

/*
Basic JavaScript: Testing Objects for Properties

Sometimes it is useful to check if the property of a given object exists or not. 
We can use the .hasOwnProperty(propname) method of objects to determine if that object has 
the given property name. .hasOwnProperty() returns true or false if the property is found or not.
*/

//Modify the function checkObj to test myObj for checkProp. 
//If the property is found, return that property's value. If not, return "Not Found".
// Setup
var myObj = {
    gift: "pony",
    pet: "kitten",
    bed: "sleigh"
  };
  
  function checkObj(checkProp) {
    if (myObj.hasOwnProperty(checkProp) == true) {
      return myObj[checkProp];
    }
    return "Not Found";
  }
    checkObj("gift");
    checkObj('table');
    checkObj('bed');