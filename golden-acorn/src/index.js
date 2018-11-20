import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter, Route } from 'react-router-dom';
import { Provider } from 'react-redux';

import App from './App';
import SimpleGoldenAcornApp from './components/SimpleGoldenAcornApp';
import ReduxGoldenAcornApp from './components/ReduxGoldenAcornApp';
import store from './store';

ReactDOM.render(
  <BrowserRouter>
    <Provider store={store}>
      <App>
        <Route exact path="/" component={SimpleGoldenAcornApp} />
        <Route path="/simple/states" component={SimpleGoldenAcornApp} />
        <Route path="/simple/redux" component={ReduxGoldenAcornApp} />
      </App>
    </Provider>
  </BrowserRouter>,
  document.getElementById('root'),
);
