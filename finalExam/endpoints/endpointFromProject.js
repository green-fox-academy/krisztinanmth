// app.js contains the endpoints
// right now we have two endpoints - one for auth <googletoken is not yet working>
// and one for the badges
// the logic is seperated onto a different service layer

const express = require('express');
const cors = require('cors');
const user = require('./src/user');
const badges = require('./src/badges');

const app = express();
const error = 'auth error';

app.use(cors());

app.get('/auth', (req, res) => {
  const userTokenAuth = user.authenticate(req.headers.username, req.headers.usertokengoogle);
  res.status(userTokenAuth ? 200 : 401);
  res.send(userTokenAuth ? { userTokenAuth } : { error });
});

app.get('/badges', (req, res) => {
  const token = req.headers.usertokenauth;
  const signedInUser = user.checkToken(token);
  res.status(signedInUser ? 200 : 401);
  res.json(signedInUser ? badges.getBadges() : error);
});

module.exports = app;


//and the user.js and badges.js include the logic of the endpoints above


// user.js ->
const db = require('lvlup-db');
const uuidv3 = require('uuid/v3');

const user = {};

user.getToken = (username, googleToken) => {
  const currentUser = db.getUserByName(username);
  if (currentUser) {
    return currentUser.tokenAuth;
  }
  const newToken = uuidv3(username.concat(googleToken), uuidv3.DNS);
  db.saveUser(username, googleToken, newToken);
  return newToken;
};

user.authenticate = (username, googleToken) => (
  username && googleToken ? user.getToken(username, googleToken) : ''
);

user.checkToken = token => (
  db.getUserByToken(token)
);

module.exports = user;


// badges.js ->
const db = require('lvlup-db');

const badges = {};

badges.getBadges = () => db.getBadges();

module.exports = badges;
