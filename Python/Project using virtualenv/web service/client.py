import requests

biodata = requests.get("http://localhost:5000/biodata")
print(biodata.json())

biodata = requests.get("http://localhost:5000/biodata")
print(biodata.json()[0]["nama"])

biodata = requests.get("http://localhost:5000/biodata/1")
print(biodata.json()["nama"])
