// create a request variable and assign a new XMLHttpRequest object to it
let request = new XMLHttpRequest();

// open a new connection, using a GET request on the API's URL endpoint
request.open('GET', 'https://ghibliapi.herokuapp.com/films', true);

request.onload = () => {
  // begin accessing JSON data here
  let data = JSON.parse(this.response);

  data.forEach(movie => {
    // log each movie's title
    console.log(movie.title);
  });
}

// send request
request.send();
