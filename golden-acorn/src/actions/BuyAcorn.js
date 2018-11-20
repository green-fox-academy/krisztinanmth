export default function buyAcorn(amount) {
  return {
    type: 'BUY_ACORN',
    payload: { amount },
  };
}
