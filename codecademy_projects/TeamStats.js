const team = {
  _players: [{
    firstName: 'nori',
    lastName: 'puskas',
    age: 23
    },
    {
    firstName: 'kriszta',
    lastName: 'nmth',
    age: 21
    },
    {
    firstName: 'coco',
    lastName: 'kovacs',
    age: 30
    },
  ],
  _games: [{
  	opponent: 'broncos',
  	teamPoints: 42,
  	opponentPoints: 27
	  },
    {
  	opponent: 'bandits',
 		teamPoints: 27,
  	opponentPoints: 32
    },
    {
  	opponent: 'hooligans',
 		teamPoints: 67,
  	opponentPoints: 18
    },
  ],
  get players () {
    return this._players;
  },
  get games () {
    return this._games;
  },
  addPlayer: function (firstName, lastName, age) {
    const player = {
      firstName: firstName,
      lastName: lastName,
      age: age
    };
    this._players.push(player);
  },
  addGame: function (opponentName, teamPoints, opponentPoints) {
    const game = {
      opponentName: opponentName,
      teamPoints: teamPoints,
      opponentPoints: opponentPoints
		};
    this._games.push(game);
  }
};

team.addPlayer('steph', 'curry', 28);
team.addPlayer('lisa', 'leslie', 44);
team.addPlayer('bugs', 'bunny', 76);

console.log(team.players);

team.addGame('yuki', 78, 9);
team.addGame('ami', 11, 23);
team.addGame('yoki', 13, 7);

console.log(team.games);
