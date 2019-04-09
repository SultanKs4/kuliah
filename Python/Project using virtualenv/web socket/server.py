# server.py

import eventlet
import socketio

sio = socketio.Server()
app = socketio.WSGIApp(sio)


@sio.on('connect')
def connect(sid, environ):
    print('new client connected ', sid)


@sio.on('message')
def message(sid, message):
    print('new message ', message)
    sio.emit("message", message)


@sio.on('disconnect')
def disconnect(sid):
    print('client disconnect ', sid)

if __name__ == '__main__':
    eventlet.wsgi.server(eventlet.listen(('', 5000)), app)
