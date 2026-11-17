import requests

num = int(input("How many jokes do you want to hear?"))
for oppa in range (0,int(num)):
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
    if joke["type"] == "single":
        print(joke["joke"])
    elif joke ["type"] == "double": 
        print(joke["setup"])
        print(joke["delivery"])

# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

