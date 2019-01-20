import React from 'react';
// import ReactDom from 'react-dom';
import ListItem from '../components/ListItem';

class ShoppingList extends React.Component {
  state = {
    list: ['macbook pro', 'cat food', 'calzone']
  };

  addItem() {
    const item = document.getElementById("listItem").value;
    document.getElementById("listItem").value = '';
    let newList = this.state.list.slice();
    newList.push(item);
    this.setState({
      list: newList,
    });
  }

  onClick(index) {
    let newList = this.state.list.splice();
    // console.log(newList);
    newList.splice(index, 1);
    // console.log('newlist spliced:', newList);
    this.setState ({
      list: newList
    });
  }

  render() {
    const listItems = [];
    // we are giving shoppingList the items as props here below
    this.state.list.forEach((item, i) => {
      listItems.push(<ListItem item={item} onClick={() => this.onClick(i)} />)
    });
    return (
      <div className="ShoppingList">
        <h1>shopping list for {this.props.name}</h1>
        <input type="text" id="listItem" placeholder="Add item" />
        <button type="buton" onClick={() => this.addItem()}>add</button>
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
