import React from "react";
import List from "./js/components/List";
import Form from "./js/components/Form"

const App = () => (
  <div className="row mt-5">
    <div className="col-md-4 offset-md-1">
    <h2>articles</h2>
      <List />
    </div>
    <div className="col-md-4 offset-md-1">
      <h2>add a new article:</h2>
      <Form />
    </div>
  </div>
);

export default App;