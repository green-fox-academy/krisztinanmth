import { combineReducers, createStore } from "../node_modules/redux";
import CountReducer from './reducers/CountReducer';

const reducer = combineReducers({
  CountReducer
});

const initialState = {
  CountReducer: {count: 123, wish_value: 12}
};

let store = createStore(reducer, initialState);
