import React from 'react';
import { Provider } from 'react-redux';
import { PersistGate } from 'redux-persist/integration/react';
import { store, persistor } from '../store/index';
import List from './List';
import Form from './Form';

const App = () => (
  <Provider store={store}>
    <PersistGate loading={null} persistor={persistor}>
      <div className="row mt-5">
        <div className="col-md-4 offset-md-1">
          <h2>Articles</h2>
          <List />
        </div>
        <div className="col-md-4 offset-md-1">
          <h2>Add a new article</h2>
          <Form />
        </div>
      </div>
    </PersistGate>
  </Provider>
);
export default App;
