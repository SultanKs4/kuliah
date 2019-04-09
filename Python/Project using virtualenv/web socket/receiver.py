# receiver.py

from socketio import Client

socketio = Client()
socketio.connect("http://localhost:5000")


@socketio.on("message")
def on_message(message):
    jbt = message.get("message")
    print(jbt)


socketio.wait()
