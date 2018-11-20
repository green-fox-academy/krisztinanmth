import { connect } from 'react-redux';
import buyAcorn from '../actions/BuyAcorn';
import Button from './Button';

const mapStateToProps = state => ({
  amount: state.amount,
  text: 'Buy one',
});

const mapDispatchToProps = dispatch => ({
  clickListener: () => dispatch(buyAcorn(1)),
});

const BuyAcorn = connect(
  mapStateToProps,
  mapDispatchToProps,
)(Button);

export default BuyAcorn;
