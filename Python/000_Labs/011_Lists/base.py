import random
x = input("U wanna hear a joke?")
jokes = ["What do you call a fish with no eyes? A fsh!", "Why do kids cross the playground? To get to the other slide!", "What do you call a sleeping bull? A bulldozer", "Wbat do you call a bear with no teeth? A gummy bear!", "What do you call an alligator in vest? An alligator!"]
if x == "y" or x== "yes" or x== "Yes":
    a = (random.randrange(0,4))
    print(jokes[a])
else: 
    print("okay.")