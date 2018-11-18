import React, { Component } from 'react';
import { connect } from 'react-redux';

class PostForm extends Component {
  handleSubmit = (e) => {
    e.preventDefault();
    const title = this.getTitle.value;
    const message = this.getMessage.value;
    const data = {
      id: new Date(),
      title,
      message
    }
    this.props.dispatch({
      type:'ADD_POST',
      data});
    this.getTitle.value='';
    this.getMessage.value='';
  }
  render() {
    return (
      <div>
        <h1>create post</h1>
        <form onSubmit={this.handleSubmit}>
          <input required type="text" ref={(input) => this.getTitle = input} placeholder="enter post title" /><br /><br />
          <textarea required rows="5" ref={(input) => this.getMessage = input} cols="28" placeholder="enter post" /><br /><br />
          <button>post</button>
        </form>
      </div>
    );
  }
}

export default connect()(PostForm);
