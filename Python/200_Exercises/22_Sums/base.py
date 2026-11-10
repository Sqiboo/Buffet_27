num1 = int(input("Please enter a number: "))
oppa = 0
for num2 in range (0,num1):
    print(num2, end="+")
    oppa+=num2
print(num1)
print("The sum of 1 to "+str(num1)+"is:"+str(oppa))