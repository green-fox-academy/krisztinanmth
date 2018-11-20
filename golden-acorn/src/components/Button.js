import React from 'react';
import PropTypes from 'prop-types';

const Button = ({ text, clickListener }) => (
  <button type="button" onClick={clickListener}>{text}</button>
);

Button.propTypes = {
  text: PropTypes.string.isRequired,
  clickListener: PropTypes.func.isRequired,
};

export default Button;
