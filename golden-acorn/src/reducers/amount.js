const amount = (state = 0, action) => {
  switch (action.type) {
    case 'BUY_ACORN':
      return state + action.payload.amount;
    case 'EAT_ACORN':
      return state > action.payload.amount
        ? state - action.payload.amount
        : 0;
    default:
      return state;
  }
};

export default amount;
