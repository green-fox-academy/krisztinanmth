import React from 'react';
import PropTypes from 'prop-types';

const Display = ({ amount }) => <div>{ amount }</div>;

Display.propTypes = {
  amount: PropTypes.number.isRequired,
};

export default Display;
