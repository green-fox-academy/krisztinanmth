import React, { Component } from 'react';
import PropTypes from 'prop-types';

export default class Counter extends Component {
  render() {
    const {count, wish_value, OnIncreaseClick, onUpdateClick} = this.props
    return (
      <div>
        <span>{count}</span>
        <button onClick={OnIncreaseClick}>increase</button>
        <input value={wish_value} type='text' onChange={onUpdateClick} />
      </div>
    )
  }
}

Counter.PropTypes = {
  count: PropTypes.number.isRequired,
  OnIncreaseClick: PropTypes.func.isRequired
}
