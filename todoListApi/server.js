
const express = require('express');
  app = express();
  port = process.env.PORT || 3000;
  mongoose = require('mongoose');
  Task = require('./api/models/todoListModel'); // loading created model here
  bodyParser = require('body-parser');

// mongoose instance ... url connection
mongoose.Promise = global.Promise;
mongoose.connect('mongodb://localhost/Tododb');

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

const routes = require('.api/routes/todoListRoutes'); // importing routes

app.listen(port);

console.log('todo list RESTful API server started on: ' + port);
