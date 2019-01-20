import React from 'react';
// import ReactDom from 'react-dom';
import ListItem from '../components/ListItem';

class ShoppingList extends React.Component {
  state = {
    list: ['macbook pro', 'cat food', 'calzone']
  };

  render() {
    const listItems = [];
    // we are giving shoppingList the items as props here below
    this.state.list.forEach((item, i) => {
      listItems.push(<ListItem item={item} onClick={() => this.onClick(i)} />)
    });
    return (
      <div className="ShoppingList">
        <h1>shopping list for {this.props.name}</h1>
        <ul>
          {listItems}
        </ul>
      </div>
    );
  }
}

// ReactDom.render(
//   <ShoppingList name="krisztinka" />,
//   document.getElementById('container')
// );

export default ShoppingList;
