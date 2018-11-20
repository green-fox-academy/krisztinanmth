import React from 'react';
import Button from './Button';
import Display from './Display';

class SimpleGoldenAcornApp extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
      amount: 0,
    };

    this.buyAcorn = this.buyAcorn.bind(this);
    this.eatAcorn = this.eatAcorn.bind(this);
  }

  buyAcorn() {
    this.setState(prevState => ({
      amount: prevState.amount + 1,
    }));
  }

  eatAcorn() {
    this.setState(prevState => ({
      amount: prevState.amount > 0
        ? prevState.amount - 1
        : 0,
    }));
  }

  render() {
    const { amount } = this.state;

    return (
      <div>
        <Button text="Buy Acorn" clickListener={this.buyAcorn} />
        <Display amount={amount} />
        <Button text="Eat acorn" clickListener={this.eatAcorn} />
      </div>
    );
  }
}

export default SimpleGoldenAcornApp;
