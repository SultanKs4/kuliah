from firebase import firebase

fire = firebase.FirebaseApplication(
    'https://h3h3-8fec5.firebaseio.com/', None)
a = fire.get('/h3h3', None)
print(a)
