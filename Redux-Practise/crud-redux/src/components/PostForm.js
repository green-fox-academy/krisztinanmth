import React, { Component } from 'react';

class PostForm extends Component {
  render() {
    return (
      <div>
        <h1>create post</h1>
        <form>
          <input required type="text" placeholder="enter post title" /><br /><br />
          <textarea required rows="5" cols="28" placeholder="enter post" /><br /><br />
          <button>post</button>
        </form>
      </div>
    );
  }
}

export default PostForm;
