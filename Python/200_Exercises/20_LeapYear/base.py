y = int(input("Pleae enter a year you'd like to check!"))
if y % 400==0:
    print("The year "+str(y)+" is a leap year")
elif y % 100==0:
    print("The year "+str(y)+" is not a leap year")
elif y % 4==0:
    print("The year "+str(y)+" is a leap year")
else:
    print("The year "+str(y)+"is a not leap year!")