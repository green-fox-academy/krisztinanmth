const getUserChoice = (userInput) => {
  userInput = userInput.toLowerCase();
  if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors' || userInput === 'bomb') {
    return userInput;
  } else {
    console.log('unvalid input, please enter "rock" or "paper" or "scissors"')
  }
}

const getComputerChoice = () => {
  let randomNumber = Math.floor(Math.random() * 3);
  switch (randomNumber) {
    case 0:
      return 'rock';
    case 1:
      return 'paper';
    case 2:
      return 'scissors';
  }
}

//console.log(getUserChoice('Paper'));
//console.log(getUserChoice('spoon'));
//console.log(getComputerChoice());
//console.log(getComputerChoice());
//console.log(getComputerChoice());
//console.log(getComputerChoice());

const determineWinner = (userChoice, computerChoice) => {
  if (userChoice === 'bomb') {
    return 'you\'ve won the game :D';
  }
  if (userChoice === computerChoice) {
    return 'it\'s a tie, no winner this time';
  }
  if (userChoice === 'rock') {
    if (computerChoice === 'paper') {
      return 'the computer has won with paper';
    } else {
      return 'you\'ve won the game :D';
    }
  }
  if (userChoice === 'paper') {
    if (computerChoice === 'scissors') {
      return 'the computer has won with scissors';
    } else {
      return 'you\'ve won the game :D';
    }
  }
  if (userChoice === 'scissors') {
    if (computeChoice === 'rock') {
      return 'the computer has won with rock';
    } else {
      return 'you\'ve won the game :D';
    }
  }
}

//console.log(determineWinner('paper', 'scissors'));
//console.log(determineWinner('paper', 'paper'));
//console.log(determineWinner('paper', 'rock'));

const playGame = () => {
  let userChoice = getUserChoice('paper');
  let computerChoice = getComputerChoice();
  console.log('your chose: ' + userChoice);
  console.log('the computer chose ' + computerChoice);
  console.log(determineWinner(userChoice, computerChoice));
}

playGame();
