# sender.py

from socketio import Client

socketio = Client()
socketio.connect("http://localhost:5000")


while True:
    nama = input("nama : ")
    message = input("message : ")
    data = {
        'nama': nama,
        'massage': message
    }
    socketio.emit("message", data)
