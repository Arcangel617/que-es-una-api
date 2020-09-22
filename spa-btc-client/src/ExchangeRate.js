import React from 'react'

const ExchangeRate = ({ exchangeRateData }) => {
    return (
        <div className="container">
            <header>
                <nav className="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                    <span className="navbar-brand">BTC Exchange Rate App</span>
                </nav>
            </header>
            <div className="jumbotron">
                <h1 className="display-4">Hello visitor!</h1>
                <p className="lead">This is just another example to demonstrate how to consume a rest api =).</p>
                <hr className="my-4" />
                    <p>The current exchange rate is taken from <a href="https://docs.coinapi.io/">https://docs.coinapi.io/</a>.</p>
                    <div className="alert alert-primary">
                        The current BTC/ARS rate is: <strong>{exchangeRateData.rate}</strong>
                    </div>
            </div>
        </div>
    )
};

export default ExchangeRate
