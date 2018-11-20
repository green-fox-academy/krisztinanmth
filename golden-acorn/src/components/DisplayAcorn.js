import { connect } from 'react-redux';
import Display from './Display';

const mapStateToProps = state => ({
  amount: state.amount,
});

const DisplayAcorn = connect(
  mapStateToProps,
)(Display);

export default DisplayAcorn;
