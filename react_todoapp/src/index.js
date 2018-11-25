import React from 'react';
import { render } from 'react-dom';
import { createStore, compose } from 'redux';
import { Provider } from 'react-redux';
import App from './components/App';
import rootReducer from './reducers';

const store = compose(window.devToolsExtension ? window.devToolsExtension() : f => f)(createStore)(rootReducer);

render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);
