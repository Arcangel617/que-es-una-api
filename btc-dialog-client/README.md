# btc-dialog-client

This is just another example to retrieve information about the current BTC/ARS exchamge rate. In this case we are using python 3 and PyQt5.

## Requirements
First of all you will need to clone this project:
```shell script
$ git clone https://github.com/Arcangel617/que-es-una-api.git
$ cd que-es-una-api # this directory contains several projects
$ cd btc-dialog-client # this example is located here
```
then you will need to create a virtual environment:
```shell script
$ python3 -m venv .venv
$ source .venv/bin/activate
```
Requirements can be found at `requirements.txt`
```
certifi==2020.6.20
chardet==3.0.4
idna==2.10
pkg-resources==0.0.0
PyQt5==5.14.0
PyQt5-sip==12.8.1
requests==2.24.0
urllib3==1.25.10
```
In order to install them, just run:
```shell script
$ pip3 install -r requirements.txt
```

## Test the application
In order to test the application you need to run:
```shell script
$ python3 main.py
```