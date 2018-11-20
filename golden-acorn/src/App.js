import React from 'react';
import PropTypes from 'prop-types';

import NavBar from './components/NavBar';

const App = ({ children }) => (
  <div>
    <NavBar />
    {children}
  </div>
);

App.propTypes = {
  children: PropTypes.node.isRequired,
};

export default App;
