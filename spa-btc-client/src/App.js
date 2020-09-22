import React, { Component } from 'react';
import ExchageRate from './ExchangeRate';

class App extends Component {
  state = {
    exchangeRateResponse: []
  }

  componentDidMount() {
    fetch('https://rest.coinapi.io/v1/exchangerate/BTC/ARS', {
      headers: {
        'X-CoinAPI-Key': 'PLACE_YOUR_API_KEY_HERE'
      }
    })
      .then(res => res.json())
      .then((data) => {
        this.setState({ exchangeRateResponse: data })
      })
      .catch(console.log)
  }

  render() {
    return (
      <ExchageRate exchangeRateData={this.state.exchangeRateResponse} />
    );
  }
}

export default App;
