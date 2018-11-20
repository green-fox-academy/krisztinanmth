import { connect } from 'react-redux';
import eatAcorn from '../actions/EatAcorn';
import Button from './Button';

const mapStateToProps = state => ({
  amount: state.amount,
  text: 'Eat one',
});

const mapDispatchToProps = dispatch => ({
  clickListener: () => dispatch(eatAcorn(1)),
});

const EatAcorn = connect(
  mapStateToProps,
  mapDispatchToProps,
)(Button);

export default EatAcorn;
