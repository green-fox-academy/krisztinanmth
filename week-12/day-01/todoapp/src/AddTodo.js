import React, { Component } from 'react';

class AddTodo extends Component {
  state = {
    content: ''
  }
  handleChange = (e) => {
    this.setState({
      content: e.target.value
    })
  }
  handleSubmit = (e) => {
    e.preventDefault();
    this.props.AddTodo(this.state)
  }
  render() {
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <label>add new todo:</label>
          <input type="text" onChange={this.handleChange} />
        </form>
      </div>
    )
  }
}
export default AddTodo;
