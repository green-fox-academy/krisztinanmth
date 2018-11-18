import { connect } from 'react-redux';
import Counter from '../components/Counter';
import * as actions from '../actions';

// map Redux state to component props:
function mapStateToProps(state) {
  return {
    count: state.CountReducer.count,
    wish_value: state.CountReducer.wish_value
  }
}

// map Redux actions to component props
function mapDispatchToProps(dispatch) {
  return {
    onIncreaseClick: () => dispatch(actions.increaseTodo()),
    onUpdateClick: event => dispatch((actions.updateTodo(event.target.value)
    )),
  }
}

// connected Component
const VisibleCounter = connect(
  mapStateToProps,
  mapDispatchToProps
)(Counter);


export default VisibleCounter;
