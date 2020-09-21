import sys

import requests
from PyQt5.QtCore import Qt
from PyQt5.QtWidgets import QApplication, QWidget, QPushButton, QDialog, QLabel


def window():
    application = QApplication(sys.argv)
    widget = QWidget()
    push_button = QPushButton(widget)
    push_button.setText("Check price")
    push_button.move(100, 100)
    push_button.clicked.connect(show_dialog)
    widget.setWindowTitle("BTC-ARS exchange rate")
    widget.show()
    sys.exit(application.exec_())


def show_dialog():
    dialog = QDialog()
    rate_label = QLabel(dialog)
    rate_label.setText('BTC/ARS: ' + retrieve_exchange_rate())
    rate_label.adjustSize()
    rate_label.move(25,25)
    dialog.setWindowTitle("Current rate")
    dialog.setWindowModality(Qt.ApplicationModal)
    dialog.exec_()

def retrieve_exchange_rate():
    url = 'https://rest.coinapi.io/v1/exchangerate/BTC/ARS'
    headers = {
        'X-CoinAPI-Key': 'PLACE_YOUR_API_KEY_HERE'
    }
    request = requests.get(url, headers=headers)
    return str(request.json()['rate'])

if __name__ == '__main__':
    retrieve_exchange_rate()
    window()
